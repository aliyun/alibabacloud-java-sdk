// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of root domains.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RootDomainsCount")
    public Integer rootDomainsCount;

    /**
     * <p>The number of subdomains.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SubDomainsCount")
    public Integer subDomainsCount;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalDomainsCount")
    public Integer totalDomainsCount;

    public static DescribeDomainCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCountResponseBody self = new DescribeDomainCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainCountResponseBody setRootDomainsCount(Integer rootDomainsCount) {
        this.rootDomainsCount = rootDomainsCount;
        return this;
    }
    public Integer getRootDomainsCount() {
        return this.rootDomainsCount;
    }

    public DescribeDomainCountResponseBody setSubDomainsCount(Integer subDomainsCount) {
        this.subDomainsCount = subDomainsCount;
        return this;
    }
    public Integer getSubDomainsCount() {
        return this.subDomainsCount;
    }

    public DescribeDomainCountResponseBody setTotalDomainsCount(Integer totalDomainsCount) {
        this.totalDomainsCount = totalDomainsCount;
        return this;
    }
    public Integer getTotalDomainsCount() {
        return this.totalDomainsCount;
    }

}
