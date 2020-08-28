// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CertInfos")
    @Validation(required = true)
    public DescribeVodDomainCertificateInfoResponseCertInfos certInfos;

    public static DescribeVodDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCertificateInfoResponse self = new DescribeVodDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainCertificateInfoResponseCertInfosCertInfo extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("CertDomainName")
        @Validation(required = true)
        public String certDomainName;

        @NameInMap("CertExpireTime")
        @Validation(required = true)
        public String certExpireTime;

        @NameInMap("CertLife")
        @Validation(required = true)
        public String certLife;

        @NameInMap("CertOrg")
        @Validation(required = true)
        public String certOrg;

        @NameInMap("CertType")
        @Validation(required = true)
        public String certType;

        @NameInMap("ServerCertificateStatus")
        @Validation(required = true)
        public String serverCertificateStatus;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVodDomainCertificateInfoResponseCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCertificateInfoResponseCertInfosCertInfo self = new DescribeVodDomainCertificateInfoResponseCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainCertificateInfoResponseCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainCertificateInfoResponseCertInfosCertInfo> certInfo;

        public static DescribeVodDomainCertificateInfoResponseCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCertificateInfoResponseCertInfos self = new DescribeVodDomainCertificateInfoResponseCertInfos();
            return TeaModel.build(map, self);
        }

    }

}
