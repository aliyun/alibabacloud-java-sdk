// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<GetExperimentFolderChildrenResponseBodyItems> items;

    public static GetExperimentFolderChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentFolderChildrenResponseBody self = new GetExperimentFolderChildrenResponseBody();
        return TeaModel.build(map, self);
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

    public GetExperimentFolderChildrenResponseBody setItems(java.util.List<GetExperimentFolderChildrenResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetExperimentFolderChildrenResponseBodyItems> getItems() {
        return this.items;
    }

    public static class GetExperimentFolderChildrenResponseBodyItems extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Empty")
        public Boolean empty;

        public static GetExperimentFolderChildrenResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentFolderChildrenResponseBodyItems self = new GetExperimentFolderChildrenResponseBodyItems();
            return TeaModel.build(map, self);
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

        public GetExperimentFolderChildrenResponseBodyItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetExperimentFolderChildrenResponseBodyItems setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

    }

}
