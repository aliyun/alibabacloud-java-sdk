// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Lifecycle extends TeaModel {
    @NameInMap("PostStart")
    public LifecyclePostStart postStart;

    @NameInMap("PreStop")
    public LifecyclePreStop preStop;

    public static Lifecycle build(java.util.Map<String, ?> map) throws Exception {
        Lifecycle self = new Lifecycle();
        return TeaModel.build(map, self);
    }

    public Lifecycle setPostStart(LifecyclePostStart postStart) {
        this.postStart = postStart;
        return this;
    }
    public LifecyclePostStart getPostStart() {
        return this.postStart;
    }

    public Lifecycle setPreStop(LifecyclePreStop preStop) {
        this.preStop = preStop;
        return this;
    }
    public LifecyclePreStop getPreStop() {
        return this.preStop;
    }

    public static class LifecyclePostStartExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static LifecyclePostStartExec build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePostStartExec self = new LifecyclePostStartExec();
            return TeaModel.build(map, self);
        }

        public LifecyclePostStartExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class LifecyclePostStart extends TeaModel {
        @NameInMap("Exec")
        public LifecyclePostStartExec exec;

        public static LifecyclePostStart build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePostStart self = new LifecyclePostStart();
            return TeaModel.build(map, self);
        }

        public LifecyclePostStart setExec(LifecyclePostStartExec exec) {
            this.exec = exec;
            return this;
        }
        public LifecyclePostStartExec getExec() {
            return this.exec;
        }

    }

    public static class LifecyclePreStopExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static LifecyclePreStopExec build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePreStopExec self = new LifecyclePreStopExec();
            return TeaModel.build(map, self);
        }

        public LifecyclePreStopExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class LifecyclePreStop extends TeaModel {
        @NameInMap("Exec")
        public LifecyclePreStopExec exec;

        public static LifecyclePreStop build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePreStop self = new LifecyclePreStop();
            return TeaModel.build(map, self);
        }

        public LifecyclePreStop setExec(LifecyclePreStopExec exec) {
            this.exec = exec;
            return this;
        }
        public LifecyclePreStopExec getExec() {
            return this.exec;
        }

    }

}
