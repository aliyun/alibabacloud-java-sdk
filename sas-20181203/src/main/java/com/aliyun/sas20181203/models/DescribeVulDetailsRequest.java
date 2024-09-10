// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsRequest extends TeaModel {
    /**
     * <p>The vulnerability announcement.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2019:3197-Important: sudo security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the vulnerability.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> or <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the names of vulnerabilities.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCA:ACSV-2020-052801</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerabilitiy</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * <li><strong>sca</strong>: vulnerability that is detected based on software component analysis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeVulDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsRequest self = new DescribeVulDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulDetailsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulDetailsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulDetailsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeVulDetailsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
