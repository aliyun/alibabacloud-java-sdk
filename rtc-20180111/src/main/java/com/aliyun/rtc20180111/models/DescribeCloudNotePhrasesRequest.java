// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotePhrasesRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Condition")
    public DescribeCloudNotePhrasesRequestCondition condition;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCloudNotePhrasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotePhrasesRequest self = new DescribeCloudNotePhrasesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotePhrasesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCloudNotePhrasesRequest setCondition(DescribeCloudNotePhrasesRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public DescribeCloudNotePhrasesRequestCondition getCondition() {
        return this.condition;
    }

    public DescribeCloudNotePhrasesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeCloudNotePhrasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeCloudNotePhrasesRequestCondition extends TeaModel {
        /**
         * <p>The hotword list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****112121</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The hotword list name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeCloudNotePhrasesRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudNotePhrasesRequestCondition self = new DescribeCloudNotePhrasesRequestCondition();
            return TeaModel.build(map, self);
        }

        public DescribeCloudNotePhrasesRequestCondition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCloudNotePhrasesRequestCondition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
