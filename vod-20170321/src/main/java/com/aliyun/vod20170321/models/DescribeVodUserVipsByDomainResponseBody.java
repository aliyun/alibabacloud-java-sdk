// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserVipsByDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>6730AC93-7B12-4B*****7F-49EE1FE8BC49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vips")
    public DescribeVodUserVipsByDomainResponseBodyVips vips;

    public static DescribeVodUserVipsByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserVipsByDomainResponseBody self = new DescribeVodUserVipsByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserVipsByDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodUserVipsByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodUserVipsByDomainResponseBody setVips(DescribeVodUserVipsByDomainResponseBodyVips vips) {
        this.vips = vips;
        return this;
    }
    public DescribeVodUserVipsByDomainResponseBodyVips getVips() {
        return this.vips;
    }

    public static class DescribeVodUserVipsByDomainResponseBodyVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<String> vip;

        public static DescribeVodUserVipsByDomainResponseBodyVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserVipsByDomainResponseBodyVips self = new DescribeVodUserVipsByDomainResponseBodyVips();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserVipsByDomainResponseBodyVips setVip(java.util.List<String> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<String> getVip() {
            return this.vip;
        }

    }

}
