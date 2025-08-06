// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPageByCondLicenseInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPageByCondLicenseInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPageByCondLicenseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageByCondLicenseInstanceResponseBody self = new GetPageByCondLicenseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageByCondLicenseInstanceResponseBody setData(GetPageByCondLicenseInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageByCondLicenseInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetPageByCondLicenseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPageByCondLicenseInstanceResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<LicenseInstanceAppDTO> list;

        @NameInMap("Total")
        public Long total;

        public static GetPageByCondLicenseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageByCondLicenseInstanceResponseBodyData self = new GetPageByCondLicenseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageByCondLicenseInstanceResponseBodyData setList(java.util.List<LicenseInstanceAppDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<LicenseInstanceAppDTO> getList() {
            return this.list;
        }

        public GetPageByCondLicenseInstanceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
