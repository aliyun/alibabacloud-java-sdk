// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class CreateApplicationInfoRequest extends TeaModel {
    // 阿里UID
    @NameInMap("AliUid")
    public Long aliUid;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // dynamic（动态业务）/static（静态业务
    @NameInMap("AppTypeList")
    public java.util.List<String> appTypeList;

    @NameInMap("AppingList")
    public java.util.List<CreateApplicationInfoRequestAppingList> appingList;

    // 商品code
    @NameInMap("ItemCode")
    public String itemCode;

    public static CreateApplicationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationInfoRequest self = new CreateApplicationInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationInfoRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateApplicationInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationInfoRequest setAppTypeList(java.util.List<String> appTypeList) {
        this.appTypeList = appTypeList;
        return this;
    }
    public java.util.List<String> getAppTypeList() {
        return this.appTypeList;
    }

    public CreateApplicationInfoRequest setAppingList(java.util.List<CreateApplicationInfoRequestAppingList> appingList) {
        this.appingList = appingList;
        return this;
    }
    public java.util.List<CreateApplicationInfoRequestAppingList> getAppingList() {
        return this.appingList;
    }

    public CreateApplicationInfoRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public static class CreateApplicationInfoRequestAppingList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        // cdn ip
        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        // cdn 域名信息
        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        // 业务方ip集合
        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

        // 业务方域名集合
        @NameInMap("OriginalUrlList")
        public java.util.List<String> originalUrlList;

        public static CreateApplicationInfoRequestAppingList build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationInfoRequestAppingList self = new CreateApplicationInfoRequestAppingList();
            return TeaModel.build(map, self);
        }

        public CreateApplicationInfoRequestAppingList setExtId(Long extId) {
            this.extId = extId;
            return this;
        }
        public Long getExtId() {
            return this.extId;
        }

        public CreateApplicationInfoRequestAppingList setFlowIp(java.util.List<String> flowIp) {
            this.flowIp = flowIp;
            return this;
        }
        public java.util.List<String> getFlowIp() {
            return this.flowIp;
        }

        public CreateApplicationInfoRequestAppingList setFlowUrl(java.util.List<String> flowUrl) {
            this.flowUrl = flowUrl;
            return this;
        }
        public java.util.List<String> getFlowUrl() {
            return this.flowUrl;
        }

        public CreateApplicationInfoRequestAppingList setOriginalIpList(java.util.List<String> originalIpList) {
            this.originalIpList = originalIpList;
            return this;
        }
        public java.util.List<String> getOriginalIpList() {
            return this.originalIpList;
        }

        public CreateApplicationInfoRequestAppingList setOriginalUrlList(java.util.List<String> originalUrlList) {
            this.originalUrlList = originalUrlList;
            return this;
        }
        public java.util.List<String> getOriginalUrlList() {
            return this.originalUrlList;
        }

    }

}
