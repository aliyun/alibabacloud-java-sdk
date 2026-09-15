// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoRequest extends TeaModel {
    /**
     * <p>The identifier of the request source. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the quarantined file.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, calling the RollbackSuspEventQuaraFile operation does not cancel the quarantine of the file in the quarantine box, which means the call does not take effect. Call the <a href="~~DescribeSuspEventQuaraFiles~~">DescribeSuspEventQuaraFiles</a> operation to obtain the quarantined file ID (the value of the Id parameter).</p>
     * </blockquote>
     * <p>QuaraFileId depends on the following prerequisite chain: (1) The SAS Agent must be installed on the ECS instance and be online. (2) The Agent must detect a malicious file and generate a security alert. (3) The alert must be quarantined by calling the HandleSecurityEvents operation (OperationCode=quara). (4) Call the DescribeSuspEventQuaraFiles operation to obtain the QuaraFileId.</p>
     * <p>Note: This parameter is actually required. If it is not provided, the API returns error code -101 (400) with the message &quot;The ID of the file to be rolled back is not provided&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    public static DescribeQuaraFileDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuaraFileDownloadInfoRequest self = new DescribeQuaraFileDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQuaraFileDownloadInfoRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeQuaraFileDownloadInfoRequest setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

}
