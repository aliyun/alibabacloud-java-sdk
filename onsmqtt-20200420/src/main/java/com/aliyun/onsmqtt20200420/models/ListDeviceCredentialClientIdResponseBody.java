// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCredentialClientIdResponseBody extends TeaModel {
    /**
     * <p>Returns the information list.</p>
     */
    @NameInMap("DeviceCredentialClientIdList")
    public ListDeviceCredentialClientIdResponseBodyDeviceCredentialClientIdList deviceCredentialClientIdList;

    /**
     * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
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
        /**
         * <p>Client list.</p>
         */
        @NameInMap("ClientIdList")
        public java.util.List<String> clientIdList;

        /**
         * <p>Indicates whether there is a token (Token) for the next query. Values: </p>
         * <ul>
         * <li>For the first query and when there is no next query, this field does not need to be filled. </li>
         * <li>If there is a next query, the value should be the NextToken returned from the previous API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>634dxxxxx75b5f</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The current page number of the returned query records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public String pageNo;

        /**
         * <p>The maximum number of results to display per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>Total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
