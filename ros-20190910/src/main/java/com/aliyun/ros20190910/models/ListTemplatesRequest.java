// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the information about tags. Default value: Disabled. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     */
    @NameInMap("IncludeTags")
    public String includeTags;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see the "Resource Group" section of the [What is Resource Management?](~~94475~~) topic.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sharing type of the template.</p>
     * <br>
     * <p>Default value: Private. Valid values:</p>
     * <br>
     * <p>*   Private: The template belongs to the template owner.</p>
     * <p>*   Shared: The template is shared with other users.</p>
     * <p>*   Official: The template is the shared template of the official version.</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("Tag")
    public java.util.List<ListTemplatesRequestTag> tag;

    /**
     * <p>The name of the template. This parameter takes effect only when the ShareType parameter is set to Private.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setIncludeTags(String includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public String getIncludeTags() {
        return this.includeTags;
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

    public ListTemplatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplatesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplatesRequest setTag(java.util.List<ListTemplatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTemplatesRequestTag> getTag() {
        return this.tag;
    }

    public ListTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class ListTemplatesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. This parameter takes effect only when the ShareType parameter is set to Private.</p>
         * <br>
         * <p>You can specify up to 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag N. This parameter takes effect only when the ShareType parameter is set to Private.</p>
         * <br>
         * <p>You can specify up to 20 tag values.</p>
         */
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
