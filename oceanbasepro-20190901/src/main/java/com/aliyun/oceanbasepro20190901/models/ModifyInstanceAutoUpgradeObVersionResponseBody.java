// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoUpgradeObVersionResponseBody extends TeaModel {
    @NameInMap("Instance")
    public ModifyInstanceAutoUpgradeObVersionResponseBodyInstance instance;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoUpgradeObVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoUpgradeObVersionResponseBody self = new ModifyInstanceAutoUpgradeObVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoUpgradeObVersionResponseBody setInstance(ModifyInstanceAutoUpgradeObVersionResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyInstanceAutoUpgradeObVersionResponseBodyInstance getInstance() {
        return this.instance;
    }

    public ModifyInstanceAutoUpgradeObVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceAutoUpgradeObVersionResponseBodyInstance extends TeaModel {
        @NameInMap("AutoUpgradeObVersion")
        public String autoUpgradeObVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyInstanceAutoUpgradeObVersionResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAutoUpgradeObVersionResponseBodyInstance self = new ModifyInstanceAutoUpgradeObVersionResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAutoUpgradeObVersionResponseBodyInstance setAutoUpgradeObVersion(String autoUpgradeObVersion) {
            this.autoUpgradeObVersion = autoUpgradeObVersion;
            return this;
        }
        public String getAutoUpgradeObVersion() {
            return this.autoUpgradeObVersion;
        }

        public ModifyInstanceAutoUpgradeObVersionResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
