// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLatestScanTaskResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1671610264000</p>
     */
    @NameInMap("LastCheckTime")
    public Long lastCheckTime;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of virus detection risks on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskNum")
    public Integer riskNum;

    /**
     * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
     * <ul>
     * <li><strong>GroupId</strong>: the ID of a server group</li>
     * <li><strong>Uuid</strong>: the UUID of a server</li>
     * </ul>
     * </li>
     * <li><p><strong>uuids</strong>: the UUIDs of servers</p>
     * </li>
     * <li><p><strong>groupIds</strong>: the IDs of server groups</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, all servers are added to the whitelist. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set the <strong>type</strong> field to <strong>Uuid</strong>, you must also specify the <strong>uuids</strong> field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;Host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The UUIDs of the assets.</p>
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
