// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6B23A612-D997-5176-8C3B-D640DFD65772</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Vulnerability whitelist information. 
     * <notice> This data is not returned when adding or updating the vulnerability whitelist in batches, it is only returned when adding or updating a single vulnerability whitelist entry. </notice></p>
     */
    @NameInMap("VulWhitelistList")
    public ModifyCreateVulWhitelistResponseBodyVulWhitelistList vulWhitelistList;

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

    public ModifyCreateVulWhitelistResponseBody setVulWhitelistList(ModifyCreateVulWhitelistResponseBodyVulWhitelistList vulWhitelistList) {
        this.vulWhitelistList = vulWhitelistList;
        return this;
    }
    public ModifyCreateVulWhitelistResponseBodyVulWhitelistList getVulWhitelistList() {
        return this.vulWhitelistList;
    }

    public static class ModifyCreateVulWhitelistResponseBodyVulWhitelistList extends TeaModel {
        /**
         * <p>Vulnerability whitelist ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
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
