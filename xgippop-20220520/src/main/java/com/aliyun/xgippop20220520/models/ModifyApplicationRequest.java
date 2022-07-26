// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ModifyApplicationRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppTypeList")
    public java.util.List<String> appTypeList;

    @NameInMap("AppingList")
    public java.util.List<ModifyApplicationRequestAppingList> appingList;

    public static ModifyApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationRequest self = new ModifyApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ModifyApplicationRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ModifyApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyApplicationRequest setAppTypeList(java.util.List<String> appTypeList) {
        this.appTypeList = appTypeList;
        return this;
    }
    public java.util.List<String> getAppTypeList() {
        return this.appTypeList;
    }

    public ModifyApplicationRequest setAppingList(java.util.List<ModifyApplicationRequestAppingList> appingList) {
        this.appingList = appingList;
        return this;
    }
    public java.util.List<ModifyApplicationRequestAppingList> getAppingList() {
        return this.appingList;
    }

    public static class ModifyApplicationRequestAppingList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

        @NameInMap("OriginalUrlList")
        public java.util.List<String> originalUrlList;

        public static ModifyApplicationRequestAppingList build(java.util.Map<String, ?> map) throws Exception {
            ModifyApplicationRequestAppingList self = new ModifyApplicationRequestAppingList();
            return TeaModel.build(map, self);
        }

        public ModifyApplicationRequestAppingList setExtId(Long extId) {
            this.extId = extId;
            return this;
        }
        public Long getExtId() {
            return this.extId;
        }

        public ModifyApplicationRequestAppingList setFlowIp(java.util.List<String> flowIp) {
            this.flowIp = flowIp;
            return this;
        }
        public java.util.List<String> getFlowIp() {
            return this.flowIp;
        }

        public ModifyApplicationRequestAppingList setFlowUrl(java.util.List<String> flowUrl) {
            this.flowUrl = flowUrl;
            return this;
        }
        public java.util.List<String> getFlowUrl() {
            return this.flowUrl;
        }

        public ModifyApplicationRequestAppingList setOriginalIpList(java.util.List<String> originalIpList) {
            this.originalIpList = originalIpList;
            return this;
        }
        public java.util.List<String> getOriginalIpList() {
            return this.originalIpList;
        }

        public ModifyApplicationRequestAppingList setOriginalUrlList(java.util.List<String> originalUrlList) {
            this.originalUrlList = originalUrlList;
            return this;
        }
        public java.util.List<String> getOriginalUrlList() {
            return this.originalUrlList;
        }

    }

}
