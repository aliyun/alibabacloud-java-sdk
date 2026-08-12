// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
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
         * <p>The authorization version of the asset. Valid values:</p>
         * <ul>
         * <li><strong>6</strong>: Anti-virus Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * <li><strong>10</strong>: Value-added Service Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>Specifies whether to enable automatic binding. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoBind")
        public Integer autoBind;

        /**
         * <p>The collection of UUIDs to bind.</p>
         * <blockquote>
         * <p>Bind and UnBind cannot both be empty.
         * Maximum number of child entries: 1000.</p>
         * </blockquote>
         */
        @NameInMap("Bind")
        public java.util.List<String> bind;

        /**
         * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindAll")
        public Boolean bindAll;

        /**
         * <p>The search conditions for assets. This parameter is in JSON format. Pay attention to the letter case when you specify this parameter.</p>
         * <blockquote>
         * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. You can call the DescribeCriteria operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;clientStatus\&quot;,\&quot;value\&quot;:\&quot;online\&quot;},{\&quot;name\&quot;:\&quot;authVersion\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
         */
        @NameInMap("Criteria")
        public String criteria;

        /**
         * <p>Specifies whether this is a pre-binding operation. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <blockquote>
         * <p>After pre-binding is enabled, the corresponding authorization quota is automatically bound to the specified servers after the purchase is completed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsPreBind")
        public Integer isPreBind;

        /**
         * <p>The logical relationship between multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions are in an <strong>OR</strong> relationship.</li>
         * <li><strong>AND</strong>: The search conditions are in an <strong>AND</strong> relationship.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("LogicalExp")
        public String logicalExp;

        /**
         * <p>The order version associated with the pre-binding. Valid values:</p>
         * <ul>
         * <li><strong>level7</strong>: Anti-virus Edition</li>
         * <li><strong>level3</strong>: Advanced Edition</li>
         * <li><strong>level2</strong>: Enterprise Edition</li>
         * <li><strong>level8</strong>: Ultimate Edition</li>
         * <li><strong>level10</strong>: value-added service only</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level2</p>
         */
        @NameInMap("NtmVersion")
        public Long ntmVersion;

        /**
         * <p>The order ID associated with the pre-binding.</p>
         * <blockquote>
         * <p>Note: This field is of the Long type. Precision loss may occur during the sequence/deserialization procedure. The value must not exceed 9007199254740991.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>263076506250432</p>
         */
        @NameInMap("PreBindOrderId")
        public Long preBindOrderId;

        /**
         * <p>The collection of UUIDs to unbind.</p>
         * <blockquote>
         * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot both be empty.</p>
         * </blockquote>
         */
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
