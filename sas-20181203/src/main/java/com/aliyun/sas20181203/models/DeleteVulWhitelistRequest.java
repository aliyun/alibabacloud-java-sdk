// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist.</p>
     * <br>
     * <p>>  To delete a vulnerability whitelist, you must provide the ID of the whitelist. You can call the [DescribeVulWhitelist](~~DescribeVulWhitelist~~) operation to query the IDs of whitelists.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The information about the whitelist. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **Name**: the name of the vulnerability.</p>
     * <br>
     * <p>*   **Type**: the type of the vulnerability. Valid values:</p>
     * <br>
     * <p>    *   **cve**: Linux software vulnerability</p>
     * <p>    *   **sys**: Windows system vulnerability</p>
     * <p>    *   **cms**: Web-CMS vulnerability</p>
     * <p>    *   **app**: application vulnerability</p>
     * <p>    *   **emg**: urgent vulnerability</p>
     * <br>
     * <p>*   **AliasName**: the alias of the vulnerability.</p>
     */
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
