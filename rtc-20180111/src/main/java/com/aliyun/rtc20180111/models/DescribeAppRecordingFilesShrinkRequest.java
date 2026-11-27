// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordingFilesShrinkRequest extends TeaModel {
    /**
     * <p>App ID.</p>
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
     * <p>The query range specifies the start time of the recording task. It is defined as a closed interval and measured in milliseconds (ms).</p>
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
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query range start time (open interval) for recording tasks, in milliseconds. If not specified, defaults to the past 3 days. You can query recordings up to one year old.</p>
     * 
     * <strong>example:</strong>
     * <p>1712376032000</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>List of recording task IDs.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    public static DescribeAppRecordingFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordingFilesShrinkRequest self = new DescribeAppRecordingFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordingFilesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppRecordingFilesShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeAppRecordingFilesShrinkRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeAppRecordingFilesShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAppRecordingFilesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppRecordingFilesShrinkRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeAppRecordingFilesShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
