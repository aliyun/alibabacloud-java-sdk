// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Tag")
    public java.util.List<ListTemplatesRequestTag> tag;

    @NameInMap("ShareType")
    public String shareType;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesRequest setTag(java.util.List<ListTemplatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTemplatesRequestTag> getTag() {
        return this.tag;
    }

    public ListTemplatesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public static class ListTemplatesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTemplatesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesRequestTag self = new ListTemplatesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTemplatesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplatesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
