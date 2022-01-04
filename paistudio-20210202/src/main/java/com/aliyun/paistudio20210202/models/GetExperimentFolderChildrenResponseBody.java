// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<GetExperimentFolderChildrenResponseBodyItems> items;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

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
