// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistRequest extends TeaModel {
    // The reason why you add the vulnerability to the whitelist.
    @NameInMap("Reason")
    public String reason;

    // The applicable scope of the whitelist. The value is a JSON string that contains the following fields:
    // 
    // *   **type**: the type of the applicable scope. Valid values:
    // 
    //     *   **GroupId**: groups
    //     *   **Uuid**: hosts
    // 
    // *   **uuids**: the UUIDs of hosts.
    // 
    // *   **groupIds**: the IDs of groups.
    // 
    // >  If you leave this parameter unspecified, the whitelist takes effect on all hosts. If you set **type** to **GroupId**, you must specify the **groupIds** parameter. If you set **type** to **Uuid**, you must specify the **uuids** parameter.
    @NameInMap("TargetInfo")
    public String targetInfo;

    // The information about the vulnerability that you want to add to the whitelist. The value is a JSON string that contains the following fields:
    // 
    // *   **Status**: the status of the vulnerability.
    // 
    // *   **GmtLast**: the timestamp when the vulnerability was last detected. Unit: milliseconds.
    // 
    // *   **LaterCount**: the number of vulnerabilities that have the medium priority.
    // 
    // *   **AsapCount**: the number of vulnerabilities that have the high priority.
    // 
    // *   **Name**: the name of the vulnerability.
    // 
    // *   **Type**: the type of the vulnerability. Valid values:
    // 
    //     *   **cve**: Linux software vulnerability
    //     *   **sys**: Windows system vulnerability
    //     *   **cms**: Web-CMS vulnerability
    //     *   **app**: application vulnerability
    //     *   **emg**: urgent vulnerabilities
    // 
    // *   **Related**: the Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.
    // 
    // *   **HandledCount**: the number of handled vulnerabilities.
    // 
    // *   **AliasName**: the alias of the vulnerability.
    // 
    // *   **RuleModifyTime**: the time when the vulnerability was last disclosed.
    // 
    // *   **NntfCount**: the number of vulnerabilities that have the low priority.
    // 
    // *   **TotalFixCount**: the total number of fixed vulnerabilities.
    // 
    // *   **Tags**: the tag that is added to the vulnerability.
    // 
    // >  You can call the [DescribeGroupedVul](~~DescribeGroupedVul~~) operation to query the information about the vulnerability that you want to add to the whitelist.
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
