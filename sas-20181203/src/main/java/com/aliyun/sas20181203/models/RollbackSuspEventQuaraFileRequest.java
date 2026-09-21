// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileRequest extends TeaModel {
    /**
     * <p>The source of the request. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the quarantined file. You can call <a href="~~DescribeSuspEventQuaraFiles~~">DescribeSuspEventQuaraFiles</a> to obtain this value from the Id field in the response. This parameter is required. If this parameter is not specified, the API returns HTTP 400 with error code -101.</p>
     * <p>Before you call this operation, make sure that the Security Center agent is installed on the ECS instance, and that file-related security events and corresponding quarantined files exist. After a file is quarantined, call DescribeSuspEventQuaraFiles to query the quarantined file ID, and then call this operation to restore the file.</p>
     * 
     * <strong>example:</strong>
     * <p>3921797</p>
     */
    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    /**
     * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>You can call <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static RollbackSuspEventQuaraFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileRequest self = new RollbackSuspEventQuaraFileRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public RollbackSuspEventQuaraFileRequest setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    public RollbackSuspEventQuaraFileRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public RollbackSuspEventQuaraFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
