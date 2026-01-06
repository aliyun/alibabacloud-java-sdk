// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Data&quot;: {</p>
     * <h1>分页信息,</h1>
     * <p>  &quot;Total&quot;: 5,
     *   &quot;PageNumber&quot;: 1,
     *   &quot;PageSize&quot;: 50,</p>
     * <h1>数据列表</h1>
     * <p>  &quot;Items&quot;: [
     *     # 每个JSONObject为一个视频/图片的元信息
     *     {
     *       # 用户oss图片地址
     *       &quot;OssUri&quot;: &quot;&quot;,
     *       # 缩略图
     *       &quot;ThumbnailUrl&quot;: &quot;&quot;,
     *       # 原图，点击查看
     *       &quot;DownloadUrl&quot;: &quot;&quot;,
     *       # 文件类型（视频/图片）
     *       &quot;FileType&quot;: &quot;&quot;,
     *       # 文件名
     *       &quot;FileName&quot;: &quot;&quot;,
     *     }, {}, ..
     *   ]
     * },
     * &quot;Success&quot;: true,
     * &quot;RequestId&quot;: &quot;***&quot;
     * }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>983863E2-****-1D15-A4AE-3468CD75383D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMultimodalSearchTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskResultResponseBody self = new ListMultimodalSearchTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskResultResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListMultimodalSearchTaskResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMultimodalSearchTaskResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMultimodalSearchTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultimodalSearchTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
