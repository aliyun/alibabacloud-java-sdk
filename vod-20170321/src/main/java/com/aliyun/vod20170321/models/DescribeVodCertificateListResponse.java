// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CertificateListModel")
    @Validation(required = true)
    public DescribeVodCertificateListResponseCertificateListModel certificateListModel;

    public static DescribeVodCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateListResponse self = new DescribeVodCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodCertificateListResponseCertificateListModelCertListCert extends TeaModel {
        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("CertId")
        @Validation(required = true)
        public Long certId;

        @NameInMap("Fingerprint")
        @Validation(required = true)
        public String fingerprint;

        @NameInMap("Common")
        @Validation(required = true)
        public String common;

        @NameInMap("Issuer")
        @Validation(required = true)
        public String issuer;

        @NameInMap("LastTime")
        @Validation(required = true)
        public Long lastTime;

        public static DescribeVodCertificateListResponseCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseCertificateListModelCertListCert self = new DescribeVodCertificateListResponseCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodCertificateListResponseCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        @Validation(required = true)
        public java.util.List<DescribeVodCertificateListResponseCertificateListModelCertListCert> cert;

        public static DescribeVodCertificateListResponseCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseCertificateListModelCertList self = new DescribeVodCertificateListResponseCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodCertificateListResponseCertificateListModel extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("CertList")
        @Validation(required = true)
        public DescribeVodCertificateListResponseCertificateListModelCertList certList;

        public static DescribeVodCertificateListResponseCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodCertificateListResponseCertificateListModel self = new DescribeVodCertificateListResponseCertificateListModel();
            return TeaModel.build(map, self);
        }

    }

}
