// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListHivesResponseBody extends TeaModel {
    @NameInMap("Hives")
    public java.util.List<ListHivesResponseBodyHives> hives;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListHivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHivesResponseBody self = new ListHivesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHivesResponseBody setHives(java.util.List<ListHivesResponseBodyHives> hives) {
        this.hives = hives;
        return this;
    }
    public java.util.List<ListHivesResponseBodyHives> getHives() {
        return this.hives;
    }

    public ListHivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHivesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListHivesResponseBodyHives extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-05-14T15:20:37+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>基础型S1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hive-3b506f0868a7451ba15e0e890706033a</p>
         */
        @NameInMap("HiveId")
        public String hiveId;

        /**
         * <strong>example:</strong>
         * <p>yy-test2</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListHivesResponseBodyHives build(java.util.Map<String, ?> map) throws Exception {
            ListHivesResponseBodyHives self = new ListHivesResponseBodyHives();
            return TeaModel.build(map, self);
        }

        public ListHivesResponseBodyHives setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListHivesResponseBodyHives setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHivesResponseBodyHives setHiveId(String hiveId) {
            this.hiveId = hiveId;
            return this;
        }
        public String getHiveId() {
            return this.hiveId;
        }

        public ListHivesResponseBodyHives setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
