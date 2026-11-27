// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotesShrinkRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>311</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Query range, closed interval of job start time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1712376532000</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query range, open interval of job start time, in milliseconds. If not specified, defaults to querying recordings from the last 3 days, with a maximum range of one year in the past.</p>
     * 
     * <strong>example:</strong>
     * <p>1712376032000</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>List of job TaskIds.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    public static DescribeCloudNotesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotesShrinkRequest self = new DescribeCloudNotesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCloudNotesShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCloudNotesShrinkRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeCloudNotesShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCloudNotesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudNotesShrinkRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeCloudNotesShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
