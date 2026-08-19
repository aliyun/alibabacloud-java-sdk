// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataRequest extends TeaModel {
    /**
     * <p>The media ID, which is the audio or video ID (VideoId). Specify this parameter filtered query playback data for a specific media file. Only one media ID can be specified. You can obtain the media ID by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When you upload an audio or video file by calling the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="~~SearchMedia~~">SearchMedia</a> operation filtered query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9ae2af636ca6c10412f44891fc****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The metric name. This parameter is used together with the <code>OrderType</code> parameter. Specify this parameter to sort the returned data in ascending or descending order by a specified metric. Valid values:</p>
     * <ul>
     * <li><strong>PlaySuccessVv</strong>: total plays.</li>
     * <li><strong>PlayPerVv</strong>: average plays per user.</li>
     * <li><strong>PlayDuration</strong>: total play duration.</li>
     * <li><strong>PlayDurationPerUv</strong>: average play duration per user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlaySuccessVv</p>
     */
    @NameInMap("OrderName")
    public String orderName;

    /**
     * <p>The sort order. This parameter is used together with the <code>OrderName</code> parameter. Specify this parameter to sort the returned data in ascending or descending order by a specified metric. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: ascending order. The returned data is sorted from smallest to largest.</li>
     * <li><strong>DESC</strong>: descending order. The returned data is sorted from largest to smallest.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The operating system of the playback device. Specify this parameter to perform a filtered query for playback data of all audio and video files by operating system. Valid values:</p>
     * <ul>
     * <li><strong>Android</strong></li>
     * <li><strong>iOS</strong></li>
     * <li><strong>Windows</strong></li>
     * <li><strong>macOS</strong></li>
     * <li><strong>Linux</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The page number of the data to return. Specify this parameter to set the page from which data starts to be returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Specify this parameter to set the number of entries displayed on each page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The playback date. Unit: day. Format: yyyyMMdd.</p>
     * <blockquote>
     * <ul>
     * <li>Only daily queries are supported.</li>
     * <li>Only data within the last 30 days can be queried.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20240322</p>
     */
    @NameInMap("PlayDate")
    public String playDate;

    /**
     * <p>The service region. Specify this parameter to perform a filtered query for playback data of all audio and video files by service region. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The terminal type of the Player SDK. Specify this parameter to perform a filtered query for playback data of all audio and video files by terminal type. Valid values:</p>
     * <ul>
     * <li><strong>Native</strong>: Android Player SDK or iOS Player SDK.</li>
     * <li><strong>Web</strong>: Web Player SDK.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Native</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeVodMediaPlayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMediaPlayDataRequest self = new DescribeVodMediaPlayDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodMediaPlayDataRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DescribeVodMediaPlayDataRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribeVodMediaPlayDataRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeVodMediaPlayDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeVodMediaPlayDataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeVodMediaPlayDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodMediaPlayDataRequest setPlayDate(String playDate) {
        this.playDate = playDate;
        return this;
    }
    public String getPlayDate() {
        return this.playDate;
    }

    public DescribeVodMediaPlayDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodMediaPlayDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
