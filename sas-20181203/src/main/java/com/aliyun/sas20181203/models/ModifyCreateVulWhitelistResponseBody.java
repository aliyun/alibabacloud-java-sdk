// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VulWhitelistList")
    public java.util.List<ModifyCreateVulWhitelistResponseBodyVulWhitelistList> vulWhitelistList;

    public static ModifyCreateVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistResponseBody self = new ModifyCreateVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCreateVulWhitelistResponseBody setVulWhitelistList(java.util.List<ModifyCreateVulWhitelistResponseBodyVulWhitelistList> vulWhitelistList) {
        this.vulWhitelistList = vulWhitelistList;
        return this;
    }
    public java.util.List<ModifyCreateVulWhitelistResponseBodyVulWhitelistList> getVulWhitelistList() {
        return this.vulWhitelistList;
    }

    public static class ModifyCreateVulWhitelistResponseBodyVulWhitelistList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static ModifyCreateVulWhitelistResponseBodyVulWhitelistList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCreateVulWhitelistResponseBodyVulWhitelistList self = new ModifyCreateVulWhitelistResponseBodyVulWhitelistList();
            return TeaModel.build(map, self);
        }

        public ModifyCreateVulWhitelistResponseBodyVulWhitelistList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
