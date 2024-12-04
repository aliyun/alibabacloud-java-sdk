// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenBackupSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;gmsBackupSet&quot;: {&quot;pubFullDownloadUrl&quot;: &quot;<a href="https://xxxxx%22,%22dnName">https://xxxxx&quot;,&quot;dnName</a>&quot;: &quot;pxc-xdb-m-xxxxxx&quot;,&quot;hostInstanceId&quot;: 0001,&quot;binlogs&quot;: [],&quot;backupEndTime&quot;: &quot;2024-10-21T10:11:56Z&quot;,&quot;backupLinkExpiredTime&quot;: &quot;2024-10-23T06:13:54Z&quot;,&quot;dnBackupSetId&quot;: &quot;00088&quot;,&quot;notCompletedBinlogs&quot;: [],&quot;commitIndex&quot;: &quot;15249275&quot;,&quot;innerFullDownloadUrl&quot;: &quot;<a href="http://xxxxx%22,%22backupStartTime">http://xxxxx&quot;,&quot;backupStartTime</a>&quot;: &quot;2024-10-21T10:09:20Z&quot;,&quot;backupSetSize&quot;: 526118912},&quot;dnBackupSets&quot;: [],&quot;insName&quot;: &quot;pxc-xxxxx&quot;,&quot;backupSetId&quot;: &quot;cb-xxxxx&quot;,&quot;canBinlogRecoverToTime&quot;: 1729567925000,&quot;backupEndTime&quot;: &quot;2024-10-21T10:12:16Z&quot;,&quot;canBinlogRecoverToTimeUTC&quot;: &quot;2024-10-22T03:32:05Z&quot;,&quot;canBackupMinRecoverToTimeUTC&quot;: &quot;2024-10-21T10:11:56Z&quot;,&quot;pitrInvalid&quot;: false,&quot;backupStartTime&quot;: &quot;2024-10-21T10:09:16Z&quot;,&quot;canBackupMinRecoverToTime&quot;: 1729505516000}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenBackupSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenBackupSetResponseBody self = new DescribeOpenBackupSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenBackupSetResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeOpenBackupSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
