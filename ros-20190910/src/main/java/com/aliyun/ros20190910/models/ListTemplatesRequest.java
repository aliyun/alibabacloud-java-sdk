// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the tag information. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("IncludeTags")
    public String includeTags;

    /**
     * <p>The page number.\
     * Pages start from page 1.\
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.\
     * Valid values: 1 to 50.\
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the resource group.\
     * For more information about resource groups, see the &quot;Resource Group&quot; section of <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sharing type of the template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Private (default): The template belongs to the template owner.</li>
     * <li>Shared: The template is shared with other users.</li>
     * <li>Official: The template is the shared template of the official version.</li>
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
     * <p>The template name. This parameter takes effect only when ShareType is set to Private. The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or letter.</p>
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
         * <p>The key of the tag. This parameter takes effect only when ShareType is set to Private.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. This parameter takes effect only when ShareType is set to Private.</p>
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
