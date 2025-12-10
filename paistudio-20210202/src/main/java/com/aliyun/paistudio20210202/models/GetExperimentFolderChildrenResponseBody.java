// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<GetExperimentFolderChildrenResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetExperimentFolderChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentFolderChildrenResponseBody self = new GetExperimentFolderChildrenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentFolderChildrenResponseBody setItems(java.util.List<GetExperimentFolderChildrenResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetExperimentFolderChildrenResponseBodyItems> getItems() {
        return this.items;
    }

    public GetExperimentFolderChildrenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentFolderChildrenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetExperimentFolderChildrenResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Empty")
        public Boolean empty;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>icon-folder</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>folder-xzf7t7****ch7qce</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Pipeline draft name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>dir</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetExperimentFolderChildrenResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentFolderChildrenResponseBodyItems self = new GetExperimentFolderChildrenResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetExperimentFolderChildrenResponseBodyItems setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public GetExperimentFolderChildrenResponseBodyItems setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetExperimentFolderChildrenResponseBodyItems setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetExperimentFolderChildrenResponseBodyItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetExperimentFolderChildrenResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetExperimentFolderChildrenResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExperimentFolderChildrenResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
