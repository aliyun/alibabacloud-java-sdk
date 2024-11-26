// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterImagesResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("datas")
    public ListClusterImagesResponseBodyDatas datas;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static ListClusterImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterImagesResponseBody self = new ListClusterImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterImagesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterImagesResponseBody setDatas(ListClusterImagesResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public ListClusterImagesResponseBodyDatas getDatas() {
        return this.datas;
    }

    public ListClusterImagesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListClusterImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterImagesResponseBodyDatasData extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("controller_name")
        public String controllerName;

        @NameInMap("controller_type")
        public String controllerType;

        @NameInMap("created")
        public String created;

        @NameInMap("image_hash")
        public String imageHash;

        @NameInMap("image_name")
        public String imageName;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("uid")
        public String uid;

        @NameInMap("updated")
        public String updated;

        public static ListClusterImagesResponseBodyDatasData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterImagesResponseBodyDatasData self = new ListClusterImagesResponseBodyDatasData();
            return TeaModel.build(map, self);
        }

        public ListClusterImagesResponseBodyDatasData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterImagesResponseBodyDatasData setControllerName(String controllerName) {
            this.controllerName = controllerName;
            return this;
        }
        public String getControllerName() {
            return this.controllerName;
        }

        public ListClusterImagesResponseBodyDatasData setControllerType(String controllerType) {
            this.controllerType = controllerType;
            return this;
        }
        public String getControllerType() {
            return this.controllerType;
        }

        public ListClusterImagesResponseBodyDatasData setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListClusterImagesResponseBodyDatasData setImageHash(String imageHash) {
            this.imageHash = imageHash;
            return this;
        }
        public String getImageHash() {
            return this.imageHash;
        }

        public ListClusterImagesResponseBodyDatasData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListClusterImagesResponseBodyDatasData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListClusterImagesResponseBodyDatasData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListClusterImagesResponseBodyDatasData setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class ListClusterImagesResponseBodyDatas extends TeaModel {
        @NameInMap("current")
        public Integer current;

        @NameInMap("data")
        public java.util.List<ListClusterImagesResponseBodyDatasData> data;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListClusterImagesResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            ListClusterImagesResponseBodyDatas self = new ListClusterImagesResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public ListClusterImagesResponseBodyDatas setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public ListClusterImagesResponseBodyDatas setData(java.util.List<ListClusterImagesResponseBodyDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListClusterImagesResponseBodyDatasData> getData() {
            return this.data;
        }

        public ListClusterImagesResponseBodyDatas setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterImagesResponseBodyDatas setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
