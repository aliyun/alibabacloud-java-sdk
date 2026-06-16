// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("BindAll")
        public Boolean bindAll;

        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

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
        @NameInMap("AutoBind")
        public Integer autoBind;

        @NameInMap("AutoBindVersion")
        public Integer autoBindVersion;

        @NameInMap("BindAction")
        public java.util.List<UpdatePostPaidBindRelRequestSdkRequestBindAction> bindAction;

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
