// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCredentialClientIdResponseBody extends TeaModel {
    @NameInMap("DeviceCredentialClientIdList")
    public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList deviceCredentialClientIdList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceCredentialClientIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCredentialClientIdResponseBody self = new ListDeviceCredentialClientIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceCredentialClientIdResponseBody setDeviceCredentialClientIdList(ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList deviceCredentialClientIdList) {
        this.deviceCredentialClientIdList = deviceCredentialClientIdList;
        return this;
    }
    public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList getDeviceCredentialClientIdList() {
        return this.deviceCredentialClientIdList;
    }

    public ListDeviceCredentialClientIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList extends TeaModel {
        @NameInMap("ClientIdList")
        public java.util.List<String> clientIdList;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageNo")
        public String pageNo;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Total")
        public String total;

        public static ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList self = new ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList();
            return TeaModel.build(map, self);
        }

        public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList setClientIdList(java.util.List<String> clientIdList) {
            this.clientIdList = clientIdList;
            return this;
        }
        public java.util.List<String> getClientIdList() {
            return this.clientIdList;
        }

        public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList setPageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public String getPageNo() {
            return this.pageNo;
        }

        public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
