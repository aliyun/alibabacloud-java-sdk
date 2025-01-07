// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EA15BA8A-D631-4375-8D40-CB7C769B0279</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The progress of the virus scan task. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The task is being initialized.</li>
     * <li><strong>Processing</strong>: The task is running.</li>
     * <li><strong>Success</strong>: The task is complete.</li>
     * <li><strong>Failed</strong>: The task fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ScanTaskProgress")
    public String scanTaskProgress;

    /**
     * <p>The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the asset on which you want to perform a virus scan task. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: server group.</li>
     * <li><strong>uuid</strong>: server.</li>
     * </ul>
     * </li>
     * <li><p><strong>name</strong>: the name of the server group or server.</p>
     * </li>
     * <li><p><strong>target</strong>: the asset on which the virus scan task runs. The value of this field varies based on the value of the type field.</p>
     * <ul>
     * <li>If the <strong>type</strong> field is set to <strong>groupId</strong>, the value of this field is the ID of the server group.</li>
     * <li>If the <strong>type</strong> field is set to <strong>uuid</strong>, the value of this field is the universally unique identifier (UUID) of the server.</li>
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
