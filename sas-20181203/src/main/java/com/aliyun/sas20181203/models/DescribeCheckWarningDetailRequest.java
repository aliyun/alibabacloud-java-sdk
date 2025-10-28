// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to query the IDs of the check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    /**
     * <p>The ID of the alert that is triggered by the check item.</p>
     * <blockquote>
     * <p> To query the details of a check item, you must provide the ID of the alert that is triggered by the check item. You can call the <a href="~~DescribeCheckWarnings~~">DescribeCheckWarnings</a> operation to query the IDs of alerts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>98675301</p>
     */
    @NameInMap("CheckWarningId")
    public Long checkWarningId;

    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the IDs of Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>103.25.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>01aec2da-5b57-4f38-b221-da5a0b2f****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeCheckWarningDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailRequest self = new DescribeCheckWarningDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningDetailRequest setCheckWarningId(Long checkWarningId) {
        this.checkWarningId = checkWarningId;
        return this;
    }
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    public DescribeCheckWarningDetailRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeCheckWarningDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCheckWarningDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCheckWarningDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
