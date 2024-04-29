// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckCustomConfigResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the invalid custom configuration items of the check item.</p>
     */
    @NameInMap("IllegalCustomConfigs")
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> illegalCustomConfigs;

    @NameInMap("IllegalRepairConfigs")
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs> illegalRepairConfigs;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCheckCustomConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckCustomConfigResponseBody self = new ChangeCheckCustomConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCheckCustomConfigResponseBody setIllegalCustomConfigs(java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> illegalCustomConfigs) {
        this.illegalCustomConfigs = illegalCustomConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> getIllegalCustomConfigs() {
        return this.illegalCustomConfigs;
    }

    public ChangeCheckCustomConfigResponseBody setIllegalRepairConfigs(java.util.List<ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs> illegalRepairConfigs) {
        this.illegalRepairConfigs = illegalRepairConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs> getIllegalRepairConfigs() {
        return this.illegalRepairConfigs;
    }

    public ChangeCheckCustomConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs extends TeaModel {
        /**
         * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs self = new ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs self = new ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigResponseBodyIllegalRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
