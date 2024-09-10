// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE272FA-7263-4554-A90F-A7857945A6D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of vulnerabilities that have the high priority.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("VulAsapSum")
    public Integer vulAsapSum;

    /**
     * <p>The number of vulnerabilities that have the medium priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulLaterSum")
    public Integer vulLaterSum;

    /**
     * <p>The number of vulnerabilities that have the low priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulNntfSum")
    public Integer vulNntfSum;

    public static GetVulStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsResponseBody self = new GetVulStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulStatisticsResponseBody setVulAsapSum(Integer vulAsapSum) {
        this.vulAsapSum = vulAsapSum;
        return this;
    }
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    public GetVulStatisticsResponseBody setVulLaterSum(Integer vulLaterSum) {
        this.vulLaterSum = vulLaterSum;
        return this;
    }
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    public GetVulStatisticsResponseBody setVulNntfSum(Integer vulNntfSum) {
        this.vulNntfSum = vulNntfSum;
        return this;
    }
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

}
