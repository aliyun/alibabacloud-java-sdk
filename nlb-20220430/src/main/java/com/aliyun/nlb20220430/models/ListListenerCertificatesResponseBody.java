// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponseBody extends TeaModel {
    /**
     * <p>The server certificates.</p>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates;

    /**
     * <p>The number of entries returned per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenerCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesResponseBody self = new ListListenerCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesResponseBody setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public ListListenerCertificatesResponseBody setCertificates(java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public ListListenerCertificatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenerCertificatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenerCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenerCertificatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenerCertificatesResponseBodyCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The type of the certificate.</p>
         * <br>
         * <p>-  Server</p>
         * <p>- Ca</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>Indicates whether the certificate is the default certificate of the listener. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>Indicates whether the certificate is associated with the listener. Valid values:</p>
         * <br>
         * <p>*   **Associating**</p>
         * <p>*   **Associated**</p>
         * <p>*   **Diassociating**</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListListenerCertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListListenerCertificatesResponseBodyCertificates self = new ListListenerCertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListListenerCertificatesResponseBodyCertificates setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListListenerCertificatesResponseBodyCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
