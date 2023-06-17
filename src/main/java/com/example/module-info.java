/**
 * 创建型
 * 1. 单例（Singleton）                         {@link com.example.singleton.Singleton}
 * 确保一个类只有一个实例，并提供该实例的全局访问点。
 * <p>
 * 2. 简单工厂（Simple Factory）                  {@link com.example.factory.simple_factory.Client}
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 * <p>
 * 3. 工厂方法（Factory Method）                  {@link com.example.factory.factory_method.Factory}
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 * <p>
 * 4. 抽象工厂（Abstract Factory）                {@link com.example.factory.abstract_factory.Client}
 * 提供一个接口，用于创建 相关的对象家族 。
 * <p>
 * 5. 生成器（Builder）                          {@link com.example.builder.Client}
 * 封装一个对象的构造过程，并允许按步骤构造。
 * <p>
 * 6. 原型模式（Prototype）                       {@link com.example.prototype.Client}
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 行为型
 * 1. 责任链（Chain Of Responsibility）          {@link com.example.chain.Client}
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 * <p>
 * 2. 命令（Command）                           {@link com.example.command.Client}
 * 将命令封装成对象中，具有以下作用：
 * 使用命令来参数化其它对象
 * 将命令放入队列中进行排队
 * 将命令的操作记录到日志中
 * 支持可撤销的操作
 * <p>
 * 3. 解释器（Interpreter）                      {@link com.example.interpreter.Client}
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。
 * <p>
 * 4. 迭代器（Iterator）                         {@link com.example.iterator.Client}
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 * <p>
 * 5. 中介者（Mediator）                         {@link com.example.mediator.Client}
 * 集中相关对象之间复杂的沟通和控制方式。
 * <p>
 * 6. 备忘录（Memento）                          {@link com.example.memento.Client}
 * 在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态。
 * <p>
 * 7. 观察者（Observer）                         {@link com.example.observer.Client}
 * 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 * 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。、
 * <p>
 * 8. 状态（State）                             {@link com.example.status.Client}
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
 * <p>
 * 9. 策略（Strategy）                          {@link com.example.strategy.Client}
 * 定义一系列算法，封装每个算法，并使它们可以互换。
 * 策略模式可以让算法独立于使用它的客户端。
 * <p>
 * 10. 模板方法（Template Method）                {@link com.example.template.Client}
 * 定义算法框架，并将一些步骤的实现延迟到子类。
 * 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 * <p>
 * 11. 访问者（Visitor）                         {@link com.example.visitor.Client}
 * 为一个对象结构（比如组合结构）增加新能力。
 * <p>
 * 12. 空对象（Null）                            {@link com.example.null_operate.Client}
 * 使用什么都不做的空对象来代替 NULL。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 结构型
 * 1. 适配器（Adapter）                          {@link com.example.adapter.Client}
 * 把一个类接口转换成另一个用户需要的接口。
 * <p>
 * 2. 桥接（Bridge）                            {@link com.example.bridge.Client}
 * 将抽象与实现分离开来，使它们可以独立变化。
 * <p>
 * 3. 组合（Composite）                         {@link com.example.composite.Client}
 * 将对象组合成树形结构来表示“整体/部分”层次关系，允许用户以相同的方式处理单独对象和组合对象。
 * <p>
 * 4. 装饰（Decorator）                         {@link com.example.decorator.Client}
 * 为对象动态添加功能。
 * <p>
 * 5. 外观（Facade）                            {@link com.example.facade.Client}
 * 提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用。
 * <p>
 * 6. 享元（Flyweight）                         {@link com.example.flyweight.Client}
 * 利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的。
 * <p>
 * 7. 代理（Proxy）                             {@link com.example.proxy.ImageViewer}
 * 控制对其它对象的访问。
 * 代理有以下四类：
 * 远程代理（Remote Proxy）：控制对远程对象（不同地址空间）的访问，它负责将请求及其参数进行编码，并向不同地址空间中的对象发送已经编码的请求。
 * 虚拟代理（Virtual Proxy）：根据需要创建开销很大的对象，它可以缓存实体的附加信息，以便延迟对它的访问，例如在网站加载一个很大图片时，不能马上完成，可以用虚拟代理缓存图片的大小信息，然后生成一张临时图片代替原始图片。
 * 保护代理（Protection Proxy）：按权限控制对象的访问，它负责检查调用者是否具有实现一个请求所必须的访问权限。
 * 智能代理（Smart Reference）：取代了简单的指针，它在访问对象时执行一些附加操作：记录对象的引用次数；当第一次引用一个对象时，将它装入内存；在访问一个实际对象前，检查是否已经锁定了它，以确保其它对象不能改变它。
 */
package com.example;