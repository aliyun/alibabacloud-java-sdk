// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerCollectDataRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. Format: yyyy-mm-ddThh:mm:ssZ (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the queried data. Valid values: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>. The supported time granularity varies based on the time span specified by <code>StartTime</code> and <code>EndTime</code>:</p>
     * <ul>
     * <li>Within 3 days: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>.</li>
     * <li>4 to 7 days: <strong>1h</strong> and <strong>1d</strong>.</li>
     * <li>More than 7 days: <strong>1d</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The metric type. You can specify multiple metrics, up to three.</p>
     * <blockquote>
     * <ul>
     * <li>Percentage data is returned in decimal format.</li>
     * </ul>
     * </blockquote>
     * <p>Quality of Service (QoS) metrics for playback quality:</p>
     * <ul>
     * <li>Vv: Number of plays.</li>
     * <li>RealVv: Actual play volume.</li>
     * <li>FirstFrame: First frame time.</li>
     * <li>SecondPlayRate: 1-second startup rate.</li>
     * <li>SlowPlayRate: Slow startup rate.</li>
     * <li>StuckCountRate: Stuttering count rate.</li>
     * <li>SeekDuration: Seek duration.</li>
     * <li>StuckDuration100s: Stuttering duration per 100 seconds.</li>
     * <li>StuckCount100s: Stuttering count per 100 seconds.</li>
     * <li>PlayFailRate: Playback failure rate.</li>
     * <li>SeedFailRate: Unstarted playback rate.</li>
     * <li>AvgPlayBitrate: Average playback bitrate.</li>
     * <li>AvgStartBitrate: Average startup bitrate.</li>
     * <li>ErrorCount100s: Error count per 100 seconds.</li>
     * </ul>
     * <p>Quality of Experience (QoE) metrics for playback experience:</p>
     * <ul>
     * <li>Uv: Number of playback users.</li>
     * <li>AvgPerVv: Average number of plays per user.</li>
     * <li>AvgVideoDuration: Average video duration.</li>
     * <li>AvgPerPlayDuration: Average playback duration per user.</li>
     * <li>AvgPerCompletionVv: Average number of completed plays per user.</li>
     * <li>CompletionVv: Completed play volume.</li>
     * <li>CompletionRate: Completion rate.</li>
     * <li>AvgPlayDuration: Average playback duration.</li>
     * <li>JumpRate5s: 5-second bounce rate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Vv,Uv,AvgPerVv</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The operating system of the playback terminal. You can specify this parameter to perform a filtered query for the playback data of a specific operating system. Valid values: <strong>Android</strong>, <strong>iOS</strong>, <strong>Harmony</strong>, <strong>Windows</strong>, <strong>macOS</strong>, and <strong>Linux</strong>.
     * The valid values vary based on the terminal type:</p>
     * <ul>
     * <li><strong>native</strong>: Android, iOS, and Harmony.</li>
     * <li><strong>web</strong>: Android, iOS, Harmony, Windows, macOS, and Linux.</li>
     * </ul>
     * <p>Separate multiple operating systems with #_#.</p>
     * 
     * <strong>example:</strong>
     * <p>Android、iOS、Windows</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The time range used to confirm the period-over-period analysis, in days (d).</p>
     * <p>For example, if you set the value to 1d (1 day), the period-over-period time range is from StartTime-1d to EndTime-1d.</p>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>You can query historical playback data for the last year.</li>
     * <li>The time range for a single query cannot exceed 31 days.</li>
     * <li>The time range is a left-closed and right-open interval [StartTime, EndTime).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-24T00:55:06Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The terminal type. Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: Web client.</li>
     * <li><strong>mobile</strong>: Native client.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeVodPlayerCollectDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerCollectDataRequest self = new DescribeVodPlayerCollectDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerCollectDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodPlayerCollectDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodPlayerCollectDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodPlayerCollectDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeVodPlayerCollectDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeVodPlayerCollectDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeVodPlayerCollectDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodPlayerCollectDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
