// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistRequest extends TeaModel {
    // The ID of the whitelist.
    // 
    // >  To delete a vulnerability whitelist, you must provide the ID of the whitelist. You can call the [DescribeVulWhitelist](~~DescribeVulWhitelist~~) operation to query the IDs of whitelists.
    @NameInMap("Id")
    public String id;

    // The information about the whitelist. The value is a JSON string that contains the following fields:
    // 
    // *   **Name**: the name of the vulnerability.
    // 
    // *   **Type**: the type of the vulnerability. Valid values:
    // 
    //     *   **cve**: Linux software vulnerability
    //     *   **sys**: Windows system vulnerability
    //     *   **cms**: Web-CMS vulnerability
    //     *   **app**: application vulnerability
    //     *   **emg**: urgent vulnerability
    // 
    // *   **AliasName**: the alias of the vulnerability.
    @NameInMap("Whitelist")
    public String whitelist;

    public static DeleteVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulWhitelistRequest self = new DeleteVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVulWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
