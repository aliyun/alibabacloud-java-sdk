// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030;

import com.aliyun.tea.*;
import com.aliyun.reid_cloud20201030.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-south-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "reidcloud.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-chengdu", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-edge-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-fujian", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai", "reidcloud.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-wuhan", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "reidcloud.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-central-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-west-1", "reidcloud.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "reidcloud.aliyuncs.com"),
            new TeaPair("me-east-1", "reidcloud.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "reidcloud.aliyuncs.com"),
            new TeaPair("us-east-1", "reidcloud.aliyuncs.com"),
            new TeaPair("us-west-1", "reidcloud.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("reid_cloud", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public DescribeBaseStatisticsResponse describeBaseStatisticsWithOptions(DescribeBaseStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBaseStatistics", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBaseStatisticsResponse());
    }

    public DescribeBaseStatisticsResponse describeBaseStatistics(DescribeBaseStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBaseStatisticsWithOptions(request, runtime);
    }

    public DescribeCameraStatisticsResponse describeCameraStatisticsWithOptions(DescribeCameraStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCameraStatistics", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCameraStatisticsResponse());
    }

    public DescribeCameraStatisticsResponse describeCameraStatistics(DescribeCameraStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCameraStatisticsWithOptions(request, runtime);
    }

    public DescribeCursorResponse describeCursorWithOptions(DescribeCursorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCursor", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCursorResponse());
    }

    public DescribeCursorResponse describeCursor(DescribeCursorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCursorWithOptions(request, runtime);
    }

    public DescribeCustomerFlowByLocationResponse describeCustomerFlowByLocationWithOptions(DescribeCustomerFlowByLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomerFlowByLocation", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomerFlowByLocationResponse());
    }

    public DescribeCustomerFlowByLocationResponse describeCustomerFlowByLocation(DescribeCustomerFlowByLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomerFlowByLocationWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevices", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public DescribeHeatMapResponse describeHeatMapWithOptions(DescribeHeatMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHeatMap", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHeatMapResponse());
    }

    public DescribeHeatMapResponse describeHeatMap(DescribeHeatMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHeatMapWithOptions(request, runtime);
    }

    public DescribeImageUrlsResponse describeImageUrlsWithOptions(DescribeImageUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageUrls", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageUrlsResponse());
    }

    public DescribeImageUrlsResponse describeImageUrls(DescribeImageUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageUrlsWithOptions(request, runtime);
    }

    public DescribeIpcLiveAddressResponse describeIpcLiveAddressWithOptions(DescribeIpcLiveAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpcLiveAddress", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpcLiveAddressResponse());
    }

    public DescribeIpcLiveAddressResponse describeIpcLiveAddress(DescribeIpcLiveAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpcLiveAddressWithOptions(request, runtime);
    }

    public DescribeOverviewDataResponse describeOverviewDataWithOptions(DescribeOverviewDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOverviewData", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOverviewDataResponse());
    }

    public DescribeOverviewDataResponse describeOverviewData(DescribeOverviewDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOverviewDataWithOptions(request, runtime);
    }

    public GetFootwearEventResponse getFootwearEventWithOptions(GetFootwearEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFootwearEvent", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetFootwearEventResponse());
    }

    public GetFootwearEventResponse getFootwearEvent(GetFootwearEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFootwearEventWithOptions(request, runtime);
    }

    public GetFootwearPositionResponse getFootwearPositionWithOptions(GetFootwearPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFootwearPosition", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetFootwearPositionResponse());
    }

    public GetFootwearPositionResponse getFootwearPosition(GetFootwearPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFootwearPositionWithOptions(request, runtime);
    }

    public ImportSpecialPersonnelResponse importSpecialPersonnelWithOptions(ImportSpecialPersonnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportSpecialPersonnel", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ImportSpecialPersonnelResponse());
    }

    public ImportSpecialPersonnelResponse importSpecialPersonnel(ImportSpecialPersonnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importSpecialPersonnelWithOptions(request, runtime);
    }

    public ListActionDataResponse listActionDataWithOptions(ListActionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListActionData", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListActionDataResponse());
    }

    public ListActionDataResponse listActionData(ListActionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActionDataWithOptions(request, runtime);
    }

    public ListDevicesImagesResponse listDevicesImagesWithOptions(ListDevicesImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevicesImages", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevicesImagesResponse());
    }

    public ListDevicesImagesResponse listDevicesImages(ListDevicesImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesImagesWithOptions(request, runtime);
    }

    public ListEmapResponse listEmapWithOptions(ListEmapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEmap", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListEmapResponse());
    }

    public ListEmapResponse listEmap(ListEmapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmapWithOptions(request, runtime);
    }

    public ListLocationResponse listLocationWithOptions(ListLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLocation", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListLocationResponse());
    }

    public ListLocationResponse listLocation(ListLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLocationWithOptions(request, runtime);
    }

    public ListMaskDetectionResultsResponse listMaskDetectionResultsWithOptions(ListMaskDetectionResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMaskDetectionResults", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListMaskDetectionResultsResponse());
    }

    public ListMaskDetectionResultsResponse listMaskDetectionResults(ListMaskDetectionResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMaskDetectionResultsWithOptions(request, runtime);
    }

    public ListPersonByImageResponse listPersonByImageWithOptions(ListPersonByImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersonByImage", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonByImageResponse());
    }

    public ListPersonByImageResponse listPersonByImage(ListPersonByImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonByImageWithOptions(request, runtime);
    }

    public ListStoreResponse listStoreWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListStore", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListStoreResponse());
    }

    public ListStoreResponse listStore() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStoreWithOptions(runtime);
    }

    public PullActionDataResponse pullActionDataWithOptions(PullActionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PullActionData", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new PullActionDataResponse());
    }

    public PullActionDataResponse pullActionData(PullActionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pullActionDataWithOptions(request, runtime);
    }

    public PullTakeShoesEventResponse pullTakeShoesEventWithOptions(PullTakeShoesEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PullTakeShoesEvent", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new PullTakeShoesEventResponse());
    }

    public PullTakeShoesEventResponse pullTakeShoesEvent(PullTakeShoesEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pullTakeShoesEventWithOptions(request, runtime);
    }

    public PullTryOnShoesEventResponse pullTryOnShoesEventWithOptions(PullTryOnShoesEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PullTryOnShoesEvent", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new PullTryOnShoesEventResponse());
    }

    public PullTryOnShoesEventResponse pullTryOnShoesEvent(PullTryOnShoesEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pullTryOnShoesEventWithOptions(request, runtime);
    }

    public ReportPacketResponse reportPacketWithOptions(ReportPacketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportPacket", "2020-10-30", "HTTPS", "POST", "AK", "json", req, runtime), new ReportPacketResponse());
    }

    public ReportPacketResponse reportPacket(ReportPacketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportPacketWithOptions(request, runtime);
    }
}
