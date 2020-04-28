# Kotlin-Scala Interop Issue
This is just a tiny replication package for this bug: https://youtrack.jetbrains.com/issue/KT-38325

Executing `./gradlew build` results in the following exception:

```
e: org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (4,31) in E:/projects/kotlin-scala-interop-bug/src/main/kotlin/Main.kt
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:124)
	at org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver.getArgumentTypeInfo(ArgumentTypeResolver.java:234)
	at org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver.analyzeArgumentsAndRecordTypes(ArgumentTypeResolver.java:401)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCall(CallResolver.java:668)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCallOrGetCachedResults(CallResolver.java:596)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.lambda$computeTasksAndResolveCall$0(CallResolver.java:212)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:210)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:198)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveFunctionCall(CallResolver.java:326)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction(CallExpressionResolver.kt:98)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck(CallExpressionResolver.kt:220)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo(CallExpressionResolver.kt:197)
	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitCallExpression(BasicExpressionTypingVisitor.java:727)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitCallExpression(ExpressionTypingVisitorDispatcher.java:388)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitCallExpression(ExpressionTypingVisitorDispatcher.java:59)
	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils.getExpressionReceiver(ExpressionTypingUtils.java:58)
	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.visitForExpression(ControlStructureTypingVisitor.java:415)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitForExpression(ExpressionTypingVisitorForStatements.java:403)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitForExpression(ExpressionTypingVisitorForStatements.java:64)
	at org.jetbrains.kotlin.psi.KtForExpression.accept(KtForExpression.java:33)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeOfLastExpressionInBlock(ExpressionTypingServices.java:395)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedTypeWithWritableScope(ExpressionTypingServices.java:320)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:200)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:177)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:425)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:64)
	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:78)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:172)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:155)
	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:985)
	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:932)
	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBodies(BodyResolver.java:918)
	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBehaviorDeclarationBodies(BodyResolver.java:125)
	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBodies(BodyResolver.java:246)
	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations(LazyTopDownAnalyzer.kt:225)
	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations$default(LazyTopDownAnalyzer.kt:60)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(TopDownAnalyzerFacadeForJVM.kt:112)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration$default(TopDownAnalyzerFacadeForJVM.kt:82)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:554)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:81)
	at org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.analyzeAndReport(AnalyzerWithCompilerReport.kt:107)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze(KotlinToJVMBytecodeCompiler.kt:545)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:176)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:163)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:51)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:85)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:43)
	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:105)
	at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:349)
	at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:105)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileIncrementally(IncrementalCompilerRunner.kt:237)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.access$compileIncrementally(IncrementalCompilerRunner.kt:37)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner$compile$2.invoke(IncrementalCompilerRunner.kt:79)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compile(IncrementalCompilerRunner.kt:91)
	at org.jetbrains.kotlin.daemon.CompileServiceImplBase.execIncrementalCompiler(CompileServiceImpl.kt:606)
	at org.jetbrains.kotlin.daemon.CompileServiceImplBase.access$execIncrementalCompiler(CompileServiceImpl.kt:99)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:1645)
	at jdk.internal.reflect.GeneratedMethodAccessor95.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:567)
	at java.rmi/sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:359)
	at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:200)
	at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:197)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:689)
	at java.rmi/sun.rmi.transport.Transport.serviceCall(Transport.java:196)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:562)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:796)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:677)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:389)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:676)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:835)
Caused by: java.lang.IllegalStateException: No parameter with index 0-0 (name=reverser$module$1 access=16) in method scala.collection.TraversableOnce.reverser$2
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.AnnotationsAndParameterCollectorMethodVisitor.visitParameter(Annotations.kt:48)
	at org.jetbrains.org.objectweb.asm.ClassReader.readMethod(ClassReader.java:1149)
	at org.jetbrains.org.objectweb.asm.ClassReader.accept(ClassReader.java:680)
	at org.jetbrains.org.objectweb.asm.ClassReader.accept(ClassReader.java:392)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaClass.<init>(BinaryJavaClass.kt:77)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaClass.<init>(BinaryJavaClass.kt:40)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass(KotlinCliJavaFileManagerImpl.kt:115)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass(KotlinCliJavaFileManagerImpl.kt:85)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl$findClass$$inlined$getOrPut$lambda$1.invoke(KotlinCliJavaFileManagerImpl.kt:113)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl$findClass$$inlined$getOrPut$lambda$1.invoke(KotlinCliJavaFileManagerImpl.kt:48)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveClass(ClassifierResolutionContext.kt:60)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveByInternalName$frontend_java(ClassifierResolutionContext.kt:101)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser$parseParameterizedClassRefSignature$1.invoke(BinaryClassSignatureParser.kt:141)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser$parseParameterizedClassRefSignature$1.invoke(BinaryClassSignatureParser.kt:38)
	at kotlin.UnsafeLazyImpl.getValue(Lazy.kt:81)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.PlainJavaClassifierType.getClassifierResolverResult(Types.kt)
	at org.jetbrains.kotlin.load.java.structure.impl.classFiles.PlainJavaClassifierType.getClassifier(Types.kt:38)
	at org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor(JavaTypeResolver.kt:130)
	at org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType(JavaTypeResolver.kt:117)
	at org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType(JavaTypeResolver.kt:93)
	at org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType(JavaTypeResolver.kt:52)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor.computeSupertypes(LazyJavaClassDescriptor.kt:191)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$1.invoke(AbstractTypeConstructor.kt:80)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:355)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours(AbstractTypeConstructor.kt:111)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.access$computeNeighbours(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:89)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:35)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:28)
	at org.jetbrains.kotlin.utils.DFS.doDfs(DFS.java:98)
	at org.jetbrains.kotlin.utils.DFS.dfs(DFS.java:27)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.isReachable(findLoopsInSupertypes.kt:61)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.access$isReachable(findLoopsInSupertypes.kt:1)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect(findLoopsInSupertypes.kt:40)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:87)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$4.doPostCompute(LockBasedStorageManager.java:189)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.postCompute(LockBasedStorageManager.java:438)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:359)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours(AbstractTypeConstructor.kt:111)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.access$computeNeighbours(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:89)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:35)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:28)
	at org.jetbrains.kotlin.utils.DFS.doDfs(DFS.java:98)
	at org.jetbrains.kotlin.utils.DFS.dfs(DFS.java:27)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.isReachable(findLoopsInSupertypes.kt:61)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.access$isReachable(findLoopsInSupertypes.kt:1)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect(findLoopsInSupertypes.kt:40)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:87)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$4.doPostCompute(LockBasedStorageManager.java:189)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.postCompute(LockBasedStorageManager.java:438)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:359)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours(AbstractTypeConstructor.kt:111)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.access$computeNeighbours(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:89)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:35)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:28)
	at org.jetbrains.kotlin.utils.DFS.doDfs(DFS.java:98)
	at org.jetbrains.kotlin.utils.DFS.dfs(DFS.java:27)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.isReachable(findLoopsInSupertypes.kt:61)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.access$isReachable(findLoopsInSupertypes.kt:1)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect(findLoopsInSupertypes.kt:40)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:87)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$4.doPostCompute(LockBasedStorageManager.java:189)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.postCompute(LockBasedStorageManager.java:438)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:359)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours(AbstractTypeConstructor.kt:111)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.access$computeNeighbours(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:89)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:35)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:28)
	at org.jetbrains.kotlin.utils.DFS.doDfs(DFS.java:98)
	at org.jetbrains.kotlin.utils.DFS.dfs(DFS.java:27)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.isReachable(findLoopsInSupertypes.kt:61)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.access$isReachable(findLoopsInSupertypes.kt:1)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect(findLoopsInSupertypes.kt:40)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:87)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$4.doPostCompute(LockBasedStorageManager.java:189)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.postCompute(LockBasedStorageManager.java:438)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:359)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours(AbstractTypeConstructor.kt:111)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.access$computeNeighbours(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:89)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:35)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl$findLoopsInSupertypesAndDisconnect$graph$1.getNeighbors(findLoopsInSupertypes.kt:28)
	at org.jetbrains.kotlin.utils.DFS.doDfs(DFS.java:98)
	at org.jetbrains.kotlin.utils.DFS.dfs(DFS.java:27)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.isReachable(findLoopsInSupertypes.kt:61)
	at org.jetbrains.kotlin.resolve.FindLoopsInSupertypes.access$isReachable(findLoopsInSupertypes.kt:1)
	at org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect(findLoopsInSupertypes.kt:40)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:87)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor$supertypes$3.invoke(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$4.doPostCompute(LockBasedStorageManager.java:189)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.postCompute(LockBasedStorageManager.java:438)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:359)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:428)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute.invoke(LockBasedStorageManager.java:459)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.getSupertypes(AbstractTypeConstructor.kt:27)
	at org.jetbrains.kotlin.types.AbstractTypeConstructor.getSupertypes(AbstractTypeConstructor.kt:26)
	at org.jetbrains.kotlin.resolve.descriptorUtil.DescriptorUtilsKt.getSuperClassNotAny(DescriptorUtils.kt:141)
	at org.jetbrains.kotlin.load.java.descriptors.UtilKt.getParentJavaStaticClassScope(util.kt:65)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeFunctionNames(LazyJavaStaticClassScope.kt:47)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2.invoke(LazyJavaScope.kt:253)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2.invoke(LazyJavaScope.kt:59)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:355)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:474)
	at org.jetbrains.kotlin.storage.StorageKt.getValue(storage.kt:42)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getFunctionNamesLazy(LazyJavaScope.kt)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getFunctionNames(LazyJavaScope.kt:257)
	at org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getContributedFunctions(LazyJavaScope.kt:266)
	at org.jetbrains.kotlin.resolve.LazyExplicitImportScope$getContributedFunctions$1.invoke(LazyExplicitImportScope.kt:51)
	at org.jetbrains.kotlin.resolve.LazyExplicitImportScope$getContributedFunctions$1.invoke(LazyExplicitImportScope.kt:30)
	at org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors(LazyExplicitImportScope.kt:127)
	at org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedFunctions(LazyExplicitImportScope.kt:51)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportScope$getContributedFunctions$1.invoke(LazyImportScope.kt:263)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportScope$getContributedFunctions$1.invoke(LazyImportScope.kt:207)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportResolver$collectFromImports$1.invoke(LazyImportScope.kt:106)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportResolver$collectFromImports$1.invoke(LazyImportScope.kt:87)
	at org.jetbrains.kotlin.storage.LockBasedStorageManager.compute(LockBasedStorageManager.java:244)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportResolver.collectFromImports(LazyImportScope.kt:103)
	at org.jetbrains.kotlin.resolve.lazy.LazyImportScope.getContributedFunctions(LazyImportScope.kt:263)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerLevelsKt.getContributedFunctionsAndConstructors(TowerLevels.kt:374)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerLevelsKt.access$getContributedFunctionsAndConstructors(TowerLevels.kt:1)
	at org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getFunctions(TowerLevels.kt:261)
	at org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessorsKt$createSimpleFunctionProcessor$1.invoke(ScopeTowerProcessors.kt:233)
	at org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessorsKt$createSimpleFunctionProcessor$1.invoke(ScopeTowerProcessors.kt)
	at org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess(ScopeTowerProcessors.kt:147)
	at org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor$DefaultImpls.process(ScopeTowerProcessors.kt:60)
	at org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor.process(ScopeTowerProcessors.kt:63)
	at org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor.process(ScopeTowerProcessors.kt:38)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData(TowerResolver.kt:271)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.access$processTowerData(TowerResolver.kt:77)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver$Task.process(TowerResolver.kt:158)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver$Task.process(TowerResolver.kt:167)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver$Task.run(TowerResolver.kt:199)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run(TowerResolver.kt:96)
	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runResolve(TowerResolver.kt:83)
	at org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution(NewResolutionOldInference.kt:194)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCall(CallResolver.java:688)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCallOrGetCachedResults(CallResolver.java:596)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.lambda$computeTasksAndResolveCall$0(CallResolver.java:212)
	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:210)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:198)
	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveFunctionCall(CallResolver.java:326)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction(CallExpressionResolver.kt:98)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck(CallExpressionResolver.kt:220)
	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo(CallExpressionResolver.kt:197)
	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitCallExpression(BasicExpressionTypingVisitor.java:727)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitCallExpression(ExpressionTypingVisitorDispatcher.java:388)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitCallExpression(ExpressionTypingVisitorDispatcher.java:46)
	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
	... 90 more

```
