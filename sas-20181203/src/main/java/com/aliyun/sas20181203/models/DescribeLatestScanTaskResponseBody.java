// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLatestScanTaskResponseBody extends TeaModel {
    /**
     * <p>The timestamp of the most recent scan, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1671610264000</p>
     */
    @NameInMap("LastCheckTime")
    public Long lastCheckTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of virus risks detected on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskNum")
    public Integer riskNum;

    /**
     * <p>The asset information scanned by the virus scan node. This parameter is expressed as a character string converted from a JSON array. The following fields are included:</p>
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
     * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;Host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The list of UUIDs of the assets.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static DescribeLatestScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestScanTaskResponseBody self = new DescribeLatestScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestScanTaskResponseBody setLastCheckTime(Long lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }
    public Long getLastCheckTime() {
        return this.lastCheckTime;
    }

    public DescribeLatestScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatestScanTaskResponseBody setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }
    public Integer getRiskNum() {
        return this.riskNum;
    }

    public DescribeLatestScanTaskResponseBody setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public DescribeLatestScanTaskResponseBody setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
