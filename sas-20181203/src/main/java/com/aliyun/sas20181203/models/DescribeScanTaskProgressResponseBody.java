// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EA15BA8A-D631-4375-8D40-CB7C769B0279</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The progress of the virus scan task. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The scan task is being initialized.</li>
     * <li><strong>Processing</strong>: The scan task is in progress.</li>
     * <li><strong>Success</strong>: The scan task is complete.</li>
     * <li><strong>Failed</strong>: The scan task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ScanTaskProgress")
    public String scanTaskProgress;

    /**
     * <p>The asset information scanned by the virus scan node. This parameter is a string converted from a JSON array in character format. The following fields are included:</p>
     * <ul>
     * <li><strong>type</strong>: The Asset Type on which the virus scan is executed. Valid values:<ul>
     * <li><strong>groupId</strong>: server group.</li>
     * <li><strong>uuid</strong>: server.</li>
     * </ul>
     * </li>
     * <li><strong>name</strong>: The name of the server group or server.</li>
     * <li><strong>target</strong>: The asset on which the virus scan is executed. The following describes the values of this field:<ul>
     * <li>If <strong>type</strong> is set to <strong>groupId</strong>, this field specifies the server group ID.</li>
     * <li>If <strong>type</strong> is set to <strong>uuid</strong>, this field specifies the UUID of the server.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    public static DescribeScanTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponseBody self = new DescribeScanTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanTaskProgressResponseBody setScanTaskProgress(String scanTaskProgress) {
        this.scanTaskProgress = scanTaskProgress;
        return this;
    }
    public String getScanTaskProgress() {
        return this.scanTaskProgress;
    }

    public DescribeScanTaskProgressResponseBody setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
