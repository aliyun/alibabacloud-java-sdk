// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListOmsDatabaseInstancesResponseBodyInstances> instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsDatabaseInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseInstancesResponseBody self = new ListOmsDatabaseInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseInstancesResponseBody setInstances(java.util.List<ListOmsDatabaseInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListOmsDatabaseInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListOmsDatabaseInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsDatabaseInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsDatabaseInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsDatabaseInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        public static ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc self = new ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ListOmsDatabaseInstancesResponseBodyInstancesConnection extends TeaModel {
        @NameInMap("Vpc")
        public ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc vpc;

        public static ListOmsDatabaseInstancesResponseBodyInstancesConnection build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstancesResponseBodyInstancesConnection self = new ListOmsDatabaseInstancesResponseBodyInstancesConnection();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstancesResponseBodyInstancesConnection setVpc(ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public ListOmsDatabaseInstancesResponseBodyInstancesConnectionVpc getVpc() {
            return this.vpc;
        }

    }

    public static class ListOmsDatabaseInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Connection")
        public ListOmsDatabaseInstancesResponseBodyInstancesConnection connection;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListOmsDatabaseInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListOmsDatabaseInstancesResponseBodyInstances self = new ListOmsDatabaseInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListOmsDatabaseInstancesResponseBodyInstances setConnection(ListOmsDatabaseInstancesResponseBodyInstancesConnection connection) {
            this.connection = connection;
            return this;
        }
        public ListOmsDatabaseInstancesResponseBodyInstancesConnection getConnection() {
            return this.connection;
        }

        public ListOmsDatabaseInstancesResponseBodyInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOmsDatabaseInstancesResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
