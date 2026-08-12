// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelRequest extends TeaModel {
    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request parameters.</p>
     */
    @NameInMap("SdkRequest")
    public UpdatePostPaidBindRelRequestSdkRequest sdkRequest;

    public static UpdatePostPaidBindRelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostPaidBindRelRequest self = new UpdatePostPaidBindRelRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePostPaidBindRelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePostPaidBindRelRequest setSdkRequest(UpdatePostPaidBindRelRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public UpdatePostPaidBindRelRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class UpdatePostPaidBindRelRequestSdkRequestBindAction extends TeaModel {
        /**
         * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindAll")
        public Boolean bindAll;

        /**
         * <p>The list of specified server UUIDs.</p>
         * <blockquote>
         * <p>Number of items &lt;= 1000. Number of items &gt;= 0.</p>
         * </blockquote>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        /**
         * <p>The Security Center protection edition to bind. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdatePostPaidBindRelRequestSdkRequestBindAction build(java.util.Map<String, ?> map) throws Exception {
            UpdatePostPaidBindRelRequestSdkRequestBindAction self = new UpdatePostPaidBindRelRequestSdkRequestBindAction();
            return TeaModel.build(map, self);
        }

        public UpdatePostPaidBindRelRequestSdkRequestBindAction setBindAll(Boolean bindAll) {
            this.bindAll = bindAll;
            return this;
        }
        public Boolean getBindAll() {
            return this.bindAll;
        }

        public UpdatePostPaidBindRelRequestSdkRequestBindAction setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public UpdatePostPaidBindRelRequestSdkRequestBindAction setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdatePostPaidBindRelRequestSdkRequest extends TeaModel {
        /**
         * <p>Specifies whether to automatically bind newly added assets. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoBind")
        public Integer autoBind;

        /**
         * <p>The edition to automatically bind when new assets are added. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition. </li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.    </li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoBindVersion")
        public Integer autoBindVersion;

        /**
         * <p>The list of binding action parameters.</p>
         */
        @NameInMap("BindAction")
        public java.util.List<UpdatePostPaidBindRelRequestSdkRequestBindAction> bindAction;

        /**
         * <p>Specifies whether to forcibly upgrade the edition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UpdateIfNecessary")
        public Boolean updateIfNecessary;

        public static UpdatePostPaidBindRelRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdatePostPaidBindRelRequestSdkRequest self = new UpdatePostPaidBindRelRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public UpdatePostPaidBindRelRequestSdkRequest setAutoBind(Integer autoBind) {
            this.autoBind = autoBind;
            return this;
        }
        public Integer getAutoBind() {
            return this.autoBind;
        }

        public UpdatePostPaidBindRelRequestSdkRequest setAutoBindVersion(Integer autoBindVersion) {
            this.autoBindVersion = autoBindVersion;
            return this;
        }
        public Integer getAutoBindVersion() {
            return this.autoBindVersion;
        }

        public UpdatePostPaidBindRelRequestSdkRequest setBindAction(java.util.List<UpdatePostPaidBindRelRequestSdkRequestBindAction> bindAction) {
            this.bindAction = bindAction;
            return this;
        }
        public java.util.List<UpdatePostPaidBindRelRequestSdkRequestBindAction> getBindAction() {
            return this.bindAction;
        }

        public UpdatePostPaidBindRelRequestSdkRequest setUpdateIfNecessary(Boolean updateIfNecessary) {
            this.updateIfNecessary = updateIfNecessary;
            return this;
        }
        public Boolean getUpdateIfNecessary() {
            return this.updateIfNecessary;
        }

    }

}
