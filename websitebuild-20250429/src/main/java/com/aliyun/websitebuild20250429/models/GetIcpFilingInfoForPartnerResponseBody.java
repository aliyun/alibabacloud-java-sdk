// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetIcpFilingInfoForPartnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetIcpFilingInfoForPartnerResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIcpFilingInfoForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIcpFilingInfoForPartnerResponseBody self = new GetIcpFilingInfoForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIcpFilingInfoForPartnerResponseBody setData(GetIcpFilingInfoForPartnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIcpFilingInfoForPartnerResponseBodyData getData() {
        return this.data;
    }

    public GetIcpFilingInfoForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIcpFilingInfoForPartnerResponseBodyData extends TeaModel {
        @NameInMap("IcpNumber")
        public String icpNumber;

        @NameInMap("Recorded")
        public Boolean recorded;

        @NameInMap("SiteRecordNumber")
        public String siteRecordNumber;

        public static GetIcpFilingInfoForPartnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIcpFilingInfoForPartnerResponseBodyData self = new GetIcpFilingInfoForPartnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIcpFilingInfoForPartnerResponseBodyData setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public GetIcpFilingInfoForPartnerResponseBodyData setRecorded(Boolean recorded) {
            this.recorded = recorded;
            return this;
        }
        public Boolean getRecorded() {
            return this.recorded;
        }

        public GetIcpFilingInfoForPartnerResponseBodyData setSiteRecordNumber(String siteRecordNumber) {
            this.siteRecordNumber = siteRecordNumber;
            return this;
        }
        public String getSiteRecordNumber() {
            return this.siteRecordNumber;
        }

    }

}
