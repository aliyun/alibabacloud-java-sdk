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
     * <p>The end time of the query. Format: yyyy-mm-ddthh:mm:ssz (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for the query data. Valid values: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>. The supported time granularity varies based on the time span specified by <code>StartTime</code> and <code>EndTime</code>:</p>
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
     * <p>The metric type. You can specify up to 3 metrics.</p>
     * <blockquote>
     * <ul>
     * <li>Percentage data is returned in decimal format.</li>
     * </ul>
     * </blockquote>
     * <p>Playback quality (QoS) metrics:</p>
     * <ul>
     * <li>Vv: play count.</li>
     * <li>RealVv: actual play count.</li>
     * <li>FirstFrame: first frame time.</li>
     * <li>SecondPlayRate: instant play rate.</li>
     * <li>SlowPlayRate: slow play rate.</li>
     * <li>StuckCountRate: stuttering rate by count.</li>
     * <li>SeekDuration: seek duration.</li>
     * <li>StuckDuration100s: stuttering duration per 100 seconds.</li>
     * <li>StuckCount100s: stuttering count per 100 seconds.</li>
     * <li>PlayFailRate: playback failure rate.</li>
     * <li>SeedFailRate: non-play rate.</li>
     * <li>AvgPlayBitrate: average playback bitrate.</li>
     * <li>AvgStartBitrate: average initial bitrate.</li>
     * <li>ErrorCount100s: error count per 100 seconds.</li>
     * </ul>
     * <p>Playback experience (QoE) metrics:</p>
     * <ul>
     * <li>Uv: unique viewers.</li>
     * <li>AvgPerVv: average plays per user.</li>
     * <li>AvgVideoDuration: average video duration.</li>
     * <li>AvgPerPlayDuration: average playback duration per user.</li>
     * <li>AvgPerCompletionVv: average completion count per user.</li>
     * <li>CompletionVv: completion count.</li>
     * <li>CompletionRate: completion rate.</li>
     * <li>AvgPlayDuration: average playback duration.</li>
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
     * <p>The operating system of the playback device. Specify this parameter to perform a filtered query for playback data of a specific operating system. Valid values: <strong>Android</strong>, <strong>iOS</strong>, <strong>Harmony</strong>, <strong>Windows</strong>, <strong>MacOS</strong>, and <strong>Linux</strong>.
     * The available values vary by terminal type:</p>
     * <ul>
     * <li><strong>native</strong>: Android, iOS, Harmony.</li>
     * <li><strong>web</strong>: Android, iOS, Harmony, Windows, MacOs, Linux.</li>
     * </ul>
     * <p>Separate multiple values with #_#.</p>
     * 
     * <strong>example:</strong>
     * <p>Android、iOS、Windows</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The time range for period-over-period analysis, in days (d).</p>
     * <p>For example, if you set this parameter to 1d (1 day), the period-over-period data is retrieved from the time range of StartTime-1d to EndTime-1d.</p>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>t<i>hh:mm:ss</i>z (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>Playback data from the last year can be queried.</li>
     * <li>The time range for a single query cannot exceed 31 days.</li>
     * <li>The time interval is left-closed and right-open [StartTime, EndTime).</li>
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
     * <li><strong>web</strong>: web.</li>
     * <li><strong>mobile</strong>: native.</li>
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
