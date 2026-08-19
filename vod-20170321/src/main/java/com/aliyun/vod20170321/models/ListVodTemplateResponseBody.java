// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A56B75B-B7E6-48*****27-A9BEAA3E50A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of snapshot template data.</p>
     */
    @NameInMap("VodTemplateInfoList")
    public java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> vodTemplateInfoList;

    public static ListVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateResponseBody self = new ListVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodTemplateResponseBody setVodTemplateInfoList(java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> vodTemplateInfoList) {
        this.vodTemplateInfoList = vodTemplateInfoList;
        return this;
    }
    public java.util.List<ListVodTemplateResponseBodyVodTemplateInfoList> getVodTemplateInfoList() {
        return this.vodTemplateInfoList;
    }

    public static class ListVodTemplateResponseBodyVodTemplateInfoList extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the template was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T08:05:59:57Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template is the default template. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: The template is the default template.</li>
         * <li><strong>NotDefault</strong>: The template is not the default template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDefault</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The time when the template was last modified. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T09:05:59:97Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detailed template configuration in JSON format. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">SnapshotTemplateConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;SnapshotConfig\&quot;:{\&quot;Count\&quot;:10,\&quot;SpecifiedOffsetTime\&quot;:0,\&quot;Interval\&quot;:1},\&quot;SnapshotType\&quot;:\&quot;NormalSnapshot\&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li><strong>Snapshot</strong>: snapshot.</li>
         * <li><strong>DynamicImage</strong>: animated image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c49f2f42b1c*****0969fcd446690</p>
         */
        @NameInMap("VodTemplateId")
        public String vodTemplateId;

        public static ListVodTemplateResponseBodyVodTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListVodTemplateResponseBodyVodTemplateInfoList self = new ListVodTemplateResponseBodyVodTemplateInfoList();
            return TeaModel.build(map, self);
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListVodTemplateResponseBodyVodTemplateInfoList setVodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }
        public String getVodTemplateId() {
            return this.vodTemplateId;
        }

    }

}
