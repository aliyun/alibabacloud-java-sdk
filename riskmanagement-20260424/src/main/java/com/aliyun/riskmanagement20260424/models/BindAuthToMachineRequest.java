// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public BindAuthToMachineRequestSdkRequest sdkRequest;

    public static BindAuthToMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineRequest self = new BindAuthToMachineRequest();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindAuthToMachineRequest setSdkRequest(BindAuthToMachineRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public BindAuthToMachineRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class BindAuthToMachineRequestSdkRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoBind")
        public Integer autoBind;

        @NameInMap("Bind")
        public java.util.List<String> bind;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindAll")
        public Boolean bindAll;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;clientStatus\&quot;,\&quot;value\&quot;:\&quot;online\&quot;},{\&quot;name\&quot;:\&quot;authVersion\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
         */
        @NameInMap("Criteria")
        public String criteria;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsPreBind")
        public Integer isPreBind;

        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("LogicalExp")
        public String logicalExp;

        /**
         * <strong>example:</strong>
         * <p>level2</p>
         */
        @NameInMap("NtmVersion")
        public Long ntmVersion;

        /**
         * <strong>example:</strong>
         * <p>263076506250432</p>
         */
        @NameInMap("PreBindOrderId")
        public Long preBindOrderId;

        @NameInMap("UnBind")
        public java.util.List<String> unBind;

        public static BindAuthToMachineRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            BindAuthToMachineRequestSdkRequest self = new BindAuthToMachineRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public BindAuthToMachineRequestSdkRequest setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public BindAuthToMachineRequestSdkRequest setAutoBind(Integer autoBind) {
            this.autoBind = autoBind;
            return this;
        }
        public Integer getAutoBind() {
            return this.autoBind;
        }

        public BindAuthToMachineRequestSdkRequest setBind(java.util.List<String> bind) {
            this.bind = bind;
            return this;
        }
        public java.util.List<String> getBind() {
            return this.bind;
        }

        public BindAuthToMachineRequestSdkRequest setBindAll(Boolean bindAll) {
            this.bindAll = bindAll;
            return this;
        }
        public Boolean getBindAll() {
            return this.bindAll;
        }

        public BindAuthToMachineRequestSdkRequest setCriteria(String criteria) {
            this.criteria = criteria;
            return this;
        }
        public String getCriteria() {
            return this.criteria;
        }

        public BindAuthToMachineRequestSdkRequest setIsPreBind(Integer isPreBind) {
            this.isPreBind = isPreBind;
            return this;
        }
        public Integer getIsPreBind() {
            return this.isPreBind;
        }

        public BindAuthToMachineRequestSdkRequest setLogicalExp(String logicalExp) {
            this.logicalExp = logicalExp;
            return this;
        }
        public String getLogicalExp() {
            return this.logicalExp;
        }

        public BindAuthToMachineRequestSdkRequest setNtmVersion(Long ntmVersion) {
            this.ntmVersion = ntmVersion;
            return this;
        }
        public Long getNtmVersion() {
            return this.ntmVersion;
        }

        public BindAuthToMachineRequestSdkRequest setPreBindOrderId(Long preBindOrderId) {
            this.preBindOrderId = preBindOrderId;
            return this;
        }
        public Long getPreBindOrderId() {
            return this.preBindOrderId;
        }

        public BindAuthToMachineRequestSdkRequest setUnBind(java.util.List<String> unBind) {
            this.unBind = unBind;
            return this;
        }
        public java.util.List<String> getUnBind() {
            return this.unBind;
        }

    }

}
