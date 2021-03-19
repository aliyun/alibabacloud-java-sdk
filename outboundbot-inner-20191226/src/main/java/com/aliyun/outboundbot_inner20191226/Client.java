// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226;

import com.aliyun.tea.*;
import com.aliyun.outboundbot_inner20191226.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("outboundbot-inner", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CheckResourceResponse checkResourceWithOptions(CheckResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResource", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourceResponse());
    }

    public CheckResourceResponse checkResource(CheckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceWithOptions(request, runtime);
    }

    public LogicalDeleteResourceResponse logicalDeleteResourceWithOptions(LogicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LogicalDeleteResource", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new LogicalDeleteResourceResponse());
    }

    public LogicalDeleteResourceResponse logicalDeleteResource(LogicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logicalDeleteResourceWithOptions(request, runtime);
    }

    public AddNumberSupplierResponse addNumberSupplierWithOptions(AddNumberSupplierRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddNumberSupplier", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new AddNumberSupplierResponse());
    }

    public AddNumberSupplierResponse addNumberSupplier(AddNumberSupplierRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNumberSupplierWithOptions(request, runtime);
    }

    public RemoveNumberSupplierResponse removeNumberSupplierWithOptions(RemoveNumberSupplierRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveNumberSupplier", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveNumberSupplierResponse());
    }

    public RemoveNumberSupplierResponse removeNumberSupplier(RemoveNumberSupplierRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeNumberSupplierWithOptions(request, runtime);
    }

    public ModifyNumberSupplierResponse modifyNumberSupplierWithOptions(ModifyNumberSupplierRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNumberSupplier", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNumberSupplierResponse());
    }

    public ModifyNumberSupplierResponse modifyNumberSupplier(ModifyNumberSupplierRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNumberSupplierWithOptions(request, runtime);
    }

    public PhysicalDeleteResourceResponse physicalDeleteResourceWithOptions(PhysicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PhysicalDeleteResource", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new PhysicalDeleteResourceResponse());
    }

    public PhysicalDeleteResourceResponse physicalDeleteResource(PhysicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteResourceWithOptions(request, runtime);
    }

    public ListNumberSuppliersForSbcMonitorResponse listNumberSuppliersForSbcMonitorWithOptions(ListNumberSuppliersForSbcMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNumberSuppliersForSbcMonitor", "2019-12-26", "HTTPS", "POST", "AK", "json", req, runtime), new ListNumberSuppliersForSbcMonitorResponse());
    }

    public ListNumberSuppliersForSbcMonitorResponse listNumberSuppliersForSbcMonitor(ListNumberSuppliersForSbcMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNumberSuppliersForSbcMonitorWithOptions(request, runtime);
    }
}
