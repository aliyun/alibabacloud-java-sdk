// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistRequest extends TeaModel {
    /**
     * <p>The reason why you add the vulnerability to the whitelist.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **type**: the type of the applicable scope. Valid values:</p>
     * <br>
     * <p>    *   **GroupId**: the ID of a server group</p>
     * <p>    *   **Uuid**: the UUID of a server</p>
     * <br>
     * <p>*   **uuids**: the UUIDs of servers</p>
     * <br>
     * <p>*   **groupIds**: the IDs of server groups</p>
     * <br>
     * <p>>  If you leave this parameter empty, all servers are added to the whitelist. If you set the **type** field to **GroupId**, you must also specify the **groupIds** field. If you set **type** to **Uuid**, you must specify the **uuids** parameter.</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The information about the vulnerability that you want to add to the whitelist. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **Status**: the status of the vulnerability.</p>
     * <br>
     * <p>*   **GmtLast**: the timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
     * <br>
     * <p>*   **LaterCount**: the number of vulnerabilities that have the medium priority.</p>
     * <br>
     * <p>*   **AsapCount**: the number of vulnerabilities that have the high priority.</p>
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
     * <p>*   **Related**: the Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
     * <br>
     * <p>*   **HandledCount**: the number of handled vulnerabilities.</p>
     * <br>
     * <p>*   **AliasName**: the alias of the vulnerability.</p>
     * <br>
     * <p>*   **RuleModifyTime**: the time when the vulnerability was last disclosed.</p>
     * <br>
     * <p>*   **NntfCount**: the number of vulnerabilities that have the low priority.</p>
     * <br>
     * <p>*   **TotalFixCount**: the total number of fixed vulnerabilities.</p>
     * <br>
     * <p>*   **Tags**: the tag that is added to the vulnerability.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedVul](~~DescribeGroupedVul~~) operation to query the information about the vulnerability that you want to add to the whitelist.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static ModifyCreateVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistRequest self = new ModifyCreateVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyCreateVulWhitelistRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public ModifyCreateVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
