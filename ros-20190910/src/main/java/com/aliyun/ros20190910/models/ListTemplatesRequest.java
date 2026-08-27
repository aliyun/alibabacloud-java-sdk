// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListTemplatesRequestFilters> filters;

    /**
     * <p>Specifies whether to query tag information. Valid values:</p>
     * <ul>
     * <li><p>Enabled: queries tag information.</p>
     * </li>
     * <li><p>Disabled (default): does not query tag information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("IncludeTags")
    public String includeTags;

    /**
     * <p>The page number of the template list.<br> The value starts from 1.<br> Default value: 1.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query.<br> Valid values: 1 to 50.<br> Default value: 10.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the resource group.<br> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a>.<br></p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The share type of the template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Private (default): The template is owned by the user.</p>
     * </li>
     * <li><p>Shared: The template is shared by other users.</p>
     * </li>
     * <li><p>Official: The template is a shared official template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTemplatesRequestTag> tag;

    /**
     * <p>The name of the template. This parameter takes effect only when ShareType is set to Private. The name can be up to 255 characters in length. It must start with a digit or a letter and can contain digits, letters, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setFilters(java.util.List<ListTemplatesRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListTemplatesRequestFilters> getFilters() {
        return this.filters;
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

    public static class ListTemplatesRequestFilters extends TeaModel {
        /**
         * <p>The filter name. You can select one or more names to query. Valid values:</p>
         * <ul>
         * <li><p>Categories: template category</p>
         * </li>
         * <li><p>DeployTypes: deployment type</p>
         * </li>
         * <li><p>ApplicationScenes: application scenario</p>
         * </li>
         * <li><p>BasicServices: basic service</p>
         * </li>
         * <li><p>ResourceTypes: resource type</p>
         * </li>
         * <li><p>TemplateNames: template name</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Categories</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListTemplatesRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesRequestFilters self = new ListTemplatesRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListTemplatesRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListTemplatesRequestTag extends TeaModel {
        /**
         * <p>The tag key. This parameter takes effect only when ShareType is set to Private.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter takes effect only when ShareType is set to Private.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy</p>
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
