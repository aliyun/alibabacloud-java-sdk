// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFixUsedCountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1CE824-7F80-546D-8AF8-4A5209F9B698</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UsedCount")
    public Integer usedCount;

    /**
     * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature in China.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UsedCountCn")
    public Integer usedCountCn;

    /**
     * <p>The number of vulnerabilities that are fixed by the vulnerability fixing feature outside China.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UsedCountSg")
    public Integer usedCountSg;

    public static DescribeFixUsedCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFixUsedCountResponseBody self = new DescribeFixUsedCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFixUsedCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFixUsedCountResponseBody setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Integer getUsedCount() {
        return this.usedCount;
    }

    public DescribeFixUsedCountResponseBody setUsedCountCn(Integer usedCountCn) {
        this.usedCountCn = usedCountCn;
        return this;
    }
    public Integer getUsedCountCn() {
        return this.usedCountCn;
    }

    public DescribeFixUsedCountResponseBody setUsedCountSg(Integer usedCountSg) {
        this.usedCountSg = usedCountSg;
        return this;
    }
    public Integer getUsedCountSg() {
        return this.usedCountSg;
    }

}
