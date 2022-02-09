// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsDatabaseInstanceResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsDatabaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseInstanceResponseBody self = new ListOmsDatabaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseInstanceResponseBody setData(java.util.List<ListOmsDatabaseInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsDatabaseInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsDatabaseInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsDatabaseInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsDatabaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsDatabaseInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsDatabaseInstanceResponseBodyDataConnectionVpc extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        public static ListOmsDatabaseInstanceResponseBodyDataConnectionVpc build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstanceResponseBodyDataConnectionVpc self = new ListOmsDatabaseInstanceResponseBodyDataConnectionVpc();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstanceResponseBodyDataConnectionVpc setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListOmsDatabaseInstanceResponseBodyDataConnectionVpc setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ListOmsDatabaseInstanceResponseBodyDataConnection extends TeaModel {
        @NameInMap("Vpc")
        public ListOmsDatabaseInstanceResponseBodyDataConnectionVpc vpc;

        public static ListOmsDatabaseInstanceResponseBodyDataConnection build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstanceResponseBodyDataConnection self = new ListOmsDatabaseInstanceResponseBodyDataConnection();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstanceResponseBodyDataConnection setVpc(ListOmsDatabaseInstanceResponseBodyDataConnectionVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public ListOmsDatabaseInstanceResponseBodyDataConnectionVpc getVpc() {
            return this.vpc;
        }

    }

    public static class ListOmsDatabaseInstanceResponseBodyData extends TeaModel {
        @NameInMap("Connection")
        public ListOmsDatabaseInstanceResponseBodyDataConnection connection;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsDatabaseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstanceResponseBodyData self = new ListOmsDatabaseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstanceResponseBodyData setConnection(ListOmsDatabaseInstanceResponseBodyDataConnection connection) {
            this.connection = connection;
            return this;
        }
        public ListOmsDatabaseInstanceResponseBodyDataConnection getConnection() {
            return this.connection;
        }

        public ListOmsDatabaseInstanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsDatabaseInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
